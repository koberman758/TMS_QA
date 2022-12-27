import java.util.Arrays;
import java.util.Scanner;

public class uvelichenieMassiva {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += a;

            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
