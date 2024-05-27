import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        // 4.Реализуйте методы merge(int[] array1, int[] array2), merge(int[] array1, int[] array2,int[] array3),
        //   merge(int[] array1, int[] array2, int[] array3, int[] array4) -который возвращает новый массив,
        //   в котором он соединяет все предыдущие (было 3 массива по 10 элементов, станет массив с 20 элементами)

        Arrays.stream(merge(new int[] {1, 2, 3, 4, 5},new int[] {6, 7, 8, 9, 10})).forEach(System.out::print);
        System.out.println(" ");
        Arrays.stream(merge(new int[] {1, 2, 3, 4, 5},new int[] {6, 7, 8, 9, 10},
                new int[] {11, 12, 13, 14, 15})).forEach(System.out::print);
        System.out.println(" ");
        Arrays.stream(merge(new int[] {1, 2, 3, 4, 5},new int[] {6, 7, 8, 9, 10},
                new int[] {11, 12, 13, 14, 15}, new int[] {16, 17, 18, 19, 20})).forEach(System.out::print);

    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result,  array1.length, array2.length);
        return result;
    }

    public static int[] merge(int[] array1, int[] array2, int[] array3) {
        int[] result = new int[array1.length + array2.length + array3.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result,  array1.length, array2.length);
        System.arraycopy(array3, 0, result,  array1.length + array2.length, array3.length);
        return result;
    }

    public static int[] merge(int[] array1, int[] array2, int[] array3, int[] array4) {
        int[] result = new int[array1.length + array2.length + array3.length + array4.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result,  array1.length, array2.length);
        System.arraycopy(array3, 0, result,  array1.length + array2.length, array3.length);
        System.arraycopy(array4, 0, result,  array1.length + array2.length + array3.length, array4.length);
        return result;
    }
}
