import java.util.*;
class Main {
    public static void main(String[] args) {
    System.out.println("Enter the number :");
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    System.out.print("Reverse of the number is ");
    int reverse=0;
    while(n>0)
    {
        int num= n%10;
        reverse=reverse*10 + num;
        
        n=n/10;
    }
        System.out.print(reverse);
     }
}
