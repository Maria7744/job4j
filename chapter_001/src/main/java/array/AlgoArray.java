package array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
        array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
        array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.
//  1,3,2,5,4
        int temp1 = array[2];
        array[2]=array[1];
        array[1] = temp1;
        //1,2,3,5,4
        int t = array[3];
        array[3] = array[4];
        array[4]= t;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}

