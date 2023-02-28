import java.util.*;
class Main {
    public static void main(String[] args) {
    System.out.println("Enter the value :");
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int originalnum=n;
    int sum=0;
    while(n>0)
    {
        int a= n%10;
        sum=sum+a;
        n=n/10;
    }
    System.out.println("Sum of digits in "+originalnum+" is "+sum);
     }
}
