public class Task_3 {
    public static void main(String[] args) {
        // 3.Реализуйте методы join(String s1, String s2), join(String s1, String s2, String s3),  ....
        //   join(String s1, String s2, String s3, String s4) -которые склеивают строки
        System.out.println(join("join one", " second line"));
        System.out.println(join("join two ", " second line ", "three line"));
        System.out.println(join("join three", " second line", " three line", " four line"));

    }
    public static String join(String s1, String s2) {
        return s1 + s2;
    }

    public static String join(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }

    public static String join(String s1, String s2, String s3, String s4) {
        return s1 + s2 + s3 + s4;
    }
}
