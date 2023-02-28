import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scn.nextInt();
        int c=0;
        int[] arr = new int[n];
        int[] arr1 = new int[n-1];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the location where you wish to delete an element");
        int loc = scn.nextInt();
        if (loc <= n && loc > 0) { // Added check for loc > 0
            for (int i = 0; i < n ; i++) {
                if(i == loc-1) // Changed arr1[loc-1] to i and removed unnecessary semicolon
                    continue;
                else
                    arr1[c++]=arr[i];
            }
            System.out.println("Array after deletion is");
            for (int i = 0; i < n-1 ; i++) {
                System.out.println(arr1[i]); 
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
