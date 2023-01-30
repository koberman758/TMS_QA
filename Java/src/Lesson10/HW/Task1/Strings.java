package Lesson10.HW.Task1;

public class Strings {
    public static void a1(String str) {
        System.out.println(str.substring(0, 4) + str.substring(9, 13));
    }

    public static void a2(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.replace(5, 8, "***");
        sb.replace(14, 17, "***");
        System.out.println(sb);
    }

    public static String a3(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.delete(0, 5);
        sb.replace(20, 21, "/");
        sb.replace(17, 19, "/");
        sb.replace(8, 14, "/");

        return sb.toString().toLowerCase();
    }

    public static void a4(String str) {
        StringBuilder sb = new StringBuilder();

        System.out.println(a3(str).toUpperCase());
    }

    public static void a5(String str) {
        if (str.contains("abc") || str.contains("ABC")) {
            System.out.println("номер документа содержит последовательность abc");
        } else
            System.out.println("номер документа не содержит последовательность abc");
    }

    public static void a6(String str) {
        if (str.startsWith("555")) {
            System.out.println("номер документа начинется с 555");
        } else
            System.out.println("номер документа не начинется с 555");
    }

    public static void a7(String str) {
        if (str.endsWith("1a2b")) {
            System.out.println("номер документа заканчивается 1a2b");
        } else
            System.out.println("номер документа не заканчивается 1a2b");
    }
}
