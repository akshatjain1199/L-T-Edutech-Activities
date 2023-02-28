import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n;
    do {
        System.out.println("Type a value between 0 and 20");
         n= scn.nextInt();
        

    }  while(n<0 || n>20);
     int res= n+17;   
    System.out.println("The final value is "+res);

     }
}
