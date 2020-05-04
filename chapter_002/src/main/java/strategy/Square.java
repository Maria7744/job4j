package strategy;

import java.util.StringJoiner;

public class Square implements Shape {

    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("++++");
        pic.add("+     +");
        pic.add("+     +");
        pic.add("++++");
        return pic.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println( square.draw());
    }
}
