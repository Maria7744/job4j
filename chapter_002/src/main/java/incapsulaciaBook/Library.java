package incapsulaciaBook;

import incapsulaciaProduct.Product;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Cod", 200);
        Book book2 = new Book("Java se", 250);
        Book book3 = new Book("Java ", 3000);
        Book book4 = new Book("First Java ", 250);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getNameBook() + " - " + bk.getPage());
        }
        System.out.println("--------");
        //Переставьте книгу с индексом 0 и 3. Выведите содержимое массива на консоль.
        Book temp1 = books[3];
        books[3] = books[0];
        books[0] = temp1;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getNameBook() + " - " + bk.getPage());

        }
        System.out.println("--------");
        System.out.println("Shown only books.nameBook \"Clean Cod\"");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getNameBook().equals("Clean Cod")) {
                System.out.println(bk.getNameBook() + " - " + bk.getPage());
            }
        }
    }
}




