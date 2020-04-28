package array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат
        for(int b = 0;b<bound;b++){
           rst[ b] = b*b;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}

