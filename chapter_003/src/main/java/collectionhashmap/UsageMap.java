package collectionhashmap;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        //Внутри метода main создайте коллекцию HashMap<String, String>
        HashMap<String, String> map = new HashMap<>();
        //Добавьте туда почту в качестве ключа и фио в качестве значения.
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        //Ключ пары должен быть уникальный. Если в Map уже есть такой key, то ячейка value будет заменена на новое значение
        //В примере размер Map будет 1, а не 2, потому что вторая пара имеет ключ, который уже был в Map
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        //Удаление. Удаление происходит по ключу через метод remove(key);
        map.remove("parsentev@yandex.ru");
        //Вывести все элементы на печать или итерироваться по элементам
//В интерфейсе java.util.Map есть методы keySet(), который возвращает коллекцию java.util.Set состоящую только из ключей.
       //Добавьте цикл for-each по ключу и выведите на печать элементы коллекции.
        for (String key : map.keySet()) {
            // //Через метод get мы получаем значение ассоциированное с этим ключом
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        //Другой способ получить все значения - это использовать метод entrySet(). Этот метод вернет коллекцию
        // java.util.Set состоящую из объекта Map.Entry, которая сразу содержит и ключ и значение.
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}

