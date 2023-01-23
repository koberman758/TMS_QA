package Task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя:");
            String name = scanner.nextLine();
            array.add(name);
        }
        System.out.println(array);
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(array);
        int size1 = array.size() - hashSet.size();
        System.out.println("Количество повторений - " + size1);
    }
}
