import java.util.*;
public class Main{
    public static void main(String[] args){    	     
    System.out.println("Enter the two numbers");
    Scanner scn= new Scanner(System.in);
    int a= scn.nextInt();
    int b= scn.nextInt();
    int temp =a;
    a=b;
    b= temp;
    System.out.println("The two values after swapping are");
    System.out.println(a);
    System.out.println(b);
    
    
    }
}
