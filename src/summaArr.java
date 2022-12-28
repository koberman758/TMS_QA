import java.util.Arrays;

public class summaArr {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        int sum = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                sum += arr[i][j];

            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(sum);
    }
}
