package array;

public class FindLoopDiaposon {


    public static int indexOfDiaposon(int[] data, int el, int start, int finish) {

            int result = -1; // если элемента нет в массиве, то возвращаем -1.
            for (int index = start; index < finish; index++) {
                if (data[index] == el) {
                    result = index;
                    break;
                }
            }
            return result;
    }
}

