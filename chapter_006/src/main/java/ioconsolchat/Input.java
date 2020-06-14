package ioconsolchat;
import java.io.IOException;
import java.util.function.Consumer;
public interface Input {
    String ask(String question, Consumer<String> consumer) throws IOException;
}

