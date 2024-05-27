public class Task_2 {
    public static void main(String[] args) {
        // 2.Реализуйте методы and(boolean x, boolean y), and(boolean x, int y), and(int x, boolean y),
        //   который будет возвращать логическое И. Целые числа равные 0 трактовать как false, остальные true.

        System.out.println(and(true, false));
        System.out.println(and(true, -1));
        System.out.println(and(1, true));

    }

    public static boolean and (boolean x, boolean y) {
        return x && y;
    }

    public static boolean and (boolean x, int y) {
        return x && (y == 0 ? false : true); // Целые числа равные 0 трактовать как false, остальные true.
    }

    public static boolean and (int x, boolean y) {
        return y && (x == 0 ? false : true);
    }

}
