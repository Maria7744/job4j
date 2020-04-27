package iolog;
//Запомните правило, если в проекте используется логгер, то
// для вывода ошибок или отладочной информации нужно использовать только логгер.
//
//Придерживаетесь единого стиля во всем проекте.
//выводится в консоль В этом примере stack исключения печатается напрямую в консоль
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserLog4jException {
    private static final Logger LOG = LoggerFactory.getLogger(UsageLog4j.class.getName());

    public static void main(String[] args) {
        try {
            throw new Exception("Not supported code");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

