import java.util.*;
public class Main{
    public static void main(String[] args){    	     
    System.out.println("Enter any number: ");
    Scanner scn= new Scanner(System.in);
    int a= scn.nextInt();
    if(a%2==0){
        System.out.println(a+" is even.");
    }
    else
    {
        System.out.println(a+" is odd.");
    }
    }
}
