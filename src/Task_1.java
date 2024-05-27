public class Task_1 {
    public static void main(String[] args) {
        // 1.Реализуйте методы, max(x,y) -для целых, вещественных чисел, и для строк (в случае строк -возвращает самую длинную)

        System.out.println(max(1 ,100));
        System.out.println(max(1f, 0.7f));
        System.out.println(max("First line", "Second line"));

    }

    public static int max (int x, int y) {
        return x < y ? y : x;
    }

    public static float max (float x, float y) {
        return x < y ? y : x;
    }

    public static String max (String x, String y) {
        return x.length() < y.length() ? y : x;
    }
}
