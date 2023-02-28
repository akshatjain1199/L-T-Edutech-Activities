import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the range :");
    int n=scn.nextInt();
    int m= scn.nextInt();
    while(n<=m){
        if(n%2==0 && n%3!=0 && n%5!=0){
            System.out.println(n+" ");
        }
        n++;
    }
        
     }
}
