import java.util.Arrays;

public class sortirovkaArr {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int b;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //  for (int k = 0; k < arr.length - 1; k++ ){ // по убыванию
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        b = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = b;
                    }
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
