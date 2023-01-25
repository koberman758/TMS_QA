package Phone;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(7777777, "nokia", 200);
        Phone phone2 = new Phone(8888888, "samsung", 150);
        Phone phone3 = new Phone(9999999, "huawei", 170);
        System.out.println("Phone1 :" + phone1 + "\n" + "Phone2 :" + phone2 + "\n" + "Phone3 :" + phone3);

        phone1.receiveCall("Vasya");
        phone2.receiveCall("Kolya");
        phone3.receiveCall("Petya");

        int number1 = phone1.getNumber();
        int number2 = phone2.getNumber();
        int number3 = phone3.getNumber();
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        phone1.receiveCall("Gena", 1234567);
        phone2.receiveCall("Misha", 7745697);
        phone3.receiveCall("Alex", 5469878);

        int[] numbers = phone1.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber());
        System.out.println(Arrays.toString(numbers));
    }
}
