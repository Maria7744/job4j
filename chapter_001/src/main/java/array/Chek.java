package array;

public class Chek {
    public static boolean mono(boolean[] data) {
        boolean result = true;
       for (int i = 0; i<data.length;i++) {
           data[i]=result;
        }
        return result;
    }
}
// public static boolean mono(boolean[] data) {
//        boolean result = true;
//boolean first = data[0];
//        for (int index = 1; index < data.length; index++) {
//            if (data[index] != first) {
//                result = false;
//                break;
//            }
//}
