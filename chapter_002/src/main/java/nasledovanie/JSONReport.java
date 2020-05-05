package nasledovanie;

public class JSONReport extends TextReport{
    // Переопределите методы generate. Этот метод должен вернуть шаблон в формате JSON.
    //Переопределение позволяет задать новое поведение уже существующего метода.
    //Механизм переопределение (overriding) существует только при условии наследования.
    public String generate(String name, String body) {
        return "{"
                + System.lineSeparator()
                + System.lineSeparator()
                + "  name : " + name + ","
                + System.lineSeparator()
                + "  body : " + body + ","
                + System.lineSeparator()
                + System.lineSeparator()
                + "}";
    }
}
