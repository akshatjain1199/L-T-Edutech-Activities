import java.util.*;
import java.util.Scanner;
import java.util.SortedSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of integers:");
        int n = sc.nextInt();

        NumberSet numberSet = new NumberSet();

        for (int i = 0; i < n; i++) {
            
            int num = sc.nextInt();
            numberSet.insertElement(num);
        }

        System.out.println("Unique digit sum");

        SortedSet<Integer> uniqueSumSet = numberSet.getSumDigits();

        for (Integer uniqueSum : uniqueSumSet) {
            System.out.println(uniqueSum);
        }
    }
}
 class NumberSet {
    private Set<Integer> numberSet;

    public NumberSet() {
        numberSet = new TreeSet<>();
    }

    public void insertElement(Integer num) {
        numberSet.add(num);
    }

    public SortedSet<Integer> getSumDigits() {
        SortedSet<Integer> uniqueSumSet = new TreeSet<>();
        for (Integer num : numberSet) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            uniqueSumSet.add(sum);
        }
        return uniqueSumSet;
    }
}
