import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        CreditCard1 card1 = new CreditCard1(1, 100);
        CreditCard1 card2 = new CreditCard1(2, 200);
        CreditCard1 card3 = new CreditCard1(3, 300);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму на которую хотите пополнить карту" + card1.cardNumber);
        float number1;
        while (!scanner.hasNextInt()) {
            System.out.println("неверный ввод, повторите");
            scanner.next();
        }
        number1 = scanner.nextInt();
        card1.currentBalance = card1.deposit(number1);


        System.out.println("Введите сумму на которую хотите пополнить карту" + card2.cardNumber);
        float number2;
        while (!scanner.hasNextInt()) {
            System.out.println("неверный ввод, повторите");
            scanner.next();
        }
        number2 = scanner.nextInt();
        card2.currentBalance = card2.deposit(number2);

        // System.out.println(card2);

        System.out.println("Введите сумму на которую хотите пополнить карту" + card3.cardNumber);
        float number3;
        while (!scanner.hasNextInt()) {
            System.out.println("неверный ввод, повторите");
            scanner.next();
        }
        number3 = scanner.nextInt();
        card3.currentBalance = card3.withdraw(number3);

        System.out.println(card1 + "\n" + card2 + "\n" + card3);


    }
}
