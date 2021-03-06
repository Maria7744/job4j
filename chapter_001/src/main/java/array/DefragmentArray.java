package array;

public class DefragmentArray {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index + 1;
                while (point < array.length) {
                    if (array[point] != null) {
                        array[index] = array[point];
                        array[point] = null;
                        break;
                    }
                    point++;
                }
            }
        }
                return array;
            }


            public static void main (String[]args){
                String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
                String[] compressed = compress(input);
                System.out.println();
                for (int index = 0; index < compressed.length; index++) {
                    System.out.print(compressed[index] + " ");
                }
            }
        }


