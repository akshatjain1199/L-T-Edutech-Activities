import java.util.*;
class Main {
    public static void main(String[] args) {
    System.out.println("Enter the range:");
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int a=0, b=1;
    System.out.println("Fibonacci series:");
    System.out.println(a);
    System.out.println(b);
    for(int i=2;i<n;i++)
    {
        int c= a+b;
        System.out.println(c);
        a=b;
        b=c;
    }
     }
}
