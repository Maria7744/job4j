package scanner;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //На данном этапе просто запомните конструкцию создания объекта Scanner. Он принимает в качестве параметра объект "System.in
        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать. Как Вас зовут? ");
        //У объекта Scanner есть метод nextLine(), который считывает все символы строки после нажатия на клавишу Enter
        //После того, как пользователь нажал кнопку Enter, программа записывает введенные символы
        // в переменную и продолжает выполнение программы.
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть!");
    }
}
