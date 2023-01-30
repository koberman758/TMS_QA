package Lesson10.HW.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Введите строку:");
        String str = new Scanner(System.in).nextLine();
        Strings.a1(str);
        Strings.a2(str);
        System.out.println(Strings.a3(str));;
        Strings.a4(str);
        Strings.a5(str);
        Strings.a6(str);
        Strings.a7(str);
    }
}
