package incapsulaciaProduct;

public class Store {
    /*
    В нем создадим три объекта: Молоко(10), Хлеб(4), Яйцо(19).*/
    public static void main(String[] args) {


        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);

        /*Сначала мы объявляет массив на 3 элемента. Далее через указания номера ячейки мы присваиваем в ячейку значение переменной Product.

Теперь давайте выведем содержимое массива в консоль. Для этого нам нужно через цикл получить каждую ячейку.*/
        Product[] prods = new Product[3];


        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;

        for (int index = 0; index < prods.length; index++) {
            //Смотрите, мы получаем ячейку массива, далее записываем ее в переменную Product pr.  А после этого выводим
            // имя и количество продукта на консоль через аксессоры.
            Product pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        //Теперь давайте создадим новый объект Масло и заменим его на Молоко.
        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        //Здесь замена производит перезаписью ячейки с индексом 0.
        prods[0] = oil;

        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        //И давайте теперь сделаем цикл, который выведет на консоль только те продукты, которых больше 10.
        //Для этого в цикле нужно добавить оператор условия.
        System.out.println("Shown only product.count > 10");
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            if (pr.getCount() > 10) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }


}



