package array;
//Реализуйте метод поиска элемента в массиве. Метод должен вернуть индекс элемента.
public class FindLoop {
    public static int indexOf(int[] data, int el) {
    int rst = -1; // если элемента нет в массиве, то возвращаем -1.
    for (int index = 1;index<data.length;index++) {
        if (data[index] == el) {
            rst = index;
            break;
        }
    }
    return rst;
}
}

