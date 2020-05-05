package nasledovanie;
//Давайте напишем класс, который выводить отчет на консоль
public class ReportUsage {
    public static void main(String[] args) {
       // TextReport report = new TextReport();
        //Давайте попробуем его вызвать и посмотреть, что будет на консоли.
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}


