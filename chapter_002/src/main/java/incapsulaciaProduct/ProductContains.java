package incapsulaciaProduct;

public class ProductContains {
    public static void main(String[] args) {
        Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 100);
      //  boolean eq = first == second;
      //  System.out.println(eq);
        // теперь через eguals
        boolean eq = first.equals(second);
        System.out.println(eq);
        //его надо переопределить ,сделаем это в классе Product
        }

    }



