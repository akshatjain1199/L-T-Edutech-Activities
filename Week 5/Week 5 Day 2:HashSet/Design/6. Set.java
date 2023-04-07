import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        System.out.println("Enter the number of values in list 1");
        int list1Size = scanner.nextInt();

        System.out.println("Enter the values");
        for (int i = 0; i < list1Size; i++) {
            int value = scanner.nextInt();
            set1.add(value);
        }

        System.out.println("Enter the number of values in list 2");
        int list2Size = scanner.nextInt();

        System.out.println("Enter the values");
        for (int i = 0; i < list2Size; i++) {
            int value = scanner.nextInt();
            set2.add(value);
        }

        System.out.println("Set 1");
        for (Integer value : set1) {
            System.out.println(value);
        }

        System.out.println("Set 2");
        for (Integer value : set2) {
            System.out.println(value);
        }

        // Union
        Set<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);

        System.out.println("Union");
        for (Integer value : union) {
            System.out.println(value);
        }
    }
}
