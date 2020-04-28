package array;

public class Matrix {
    //таблица умножения
        public int[][] multiple(int size) {
            int[][] table = new int[size][size];
        for (int index=1;index<=size;index++){
            for (int j=1;j<=size;j++){
              table[index-1][j-1]=index*j;
            }
        }
        return table;
            //System.out.println(int[size][size]table);
          //  System.out.print("");
    }
    }

