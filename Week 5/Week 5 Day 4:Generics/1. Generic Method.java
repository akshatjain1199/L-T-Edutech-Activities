import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static <E> void printArray(E[] elements) {
        Arrays.sort(elements);
        for (E element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        Integer[] intArray = new Integer[n];
        Double[] doubleArray = new Double[n];
        
        System.out.println("Enter integers one by one");
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.println("Enter double values one by one");
        for (int i = 0; i < n; i++) {
            doubleArray[i] = sc.nextDouble();
        }
        
        System.out.println("Printing Integer Array");
        printArray(intArray);
        System.out.println("Printing Double Array");
        printArray(doubleArray);
        
        sc.close();
    }
}
