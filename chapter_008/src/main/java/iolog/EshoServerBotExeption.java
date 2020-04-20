package iolog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EshoServerBotExeption {
    private static final Logger LOG = LoggerFactory.getLogger(EshoServerBotExeption.class.getName());

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(9000)) {
            boolean serverClosed = false;
            while (!serverClosed) {
                Socket socket = server.accept();
                try (OutputStream out = socket.getOutputStream();
                     BufferedReader in = new BufferedReader(
                             new InputStreamReader(socket.getInputStream()))) {
                    String str = in.readLine();
                    if (str != null) {
                        // Исходная строка: GET /?msg=Hello HTTP/1.1
                        // Разбиваем строку по проблему
                        // По середине хранится /?msg=Hello
                        String[] parts = str.split(" ");
                        // Находим индекс =
                        int index = parts[1].lastIndexOf('=');
                        // Вычленяем аргумент
                        String arg = parts[1].substring(index + 1);
                        // По умолчанию сервер отдаем сообщение обратно
                        String answer = arg;
                        // Если Hello, то приветствуем
                        if ("Hello".equals(arg)) {
                            answer = "Hello";
                        } else if ("Exit".equals(arg)) {
                            // Если Exit, то завершаем работу сервера
                            serverClosed = true;
                        }
                        out.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
                        out.write((answer + "\r\n\r\n").getBytes());

                        try {
                            throw new IOException("Not supported code");

                        } catch (IOException e) {
                            e.printStackTrace();
                            LOG.error("Exception in log example", e);
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



