import java.util.*;
class Main {
    public static void main(String[] args) {
    System.out.println("Enter n");
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    System.out.println("Enter m");
    int m= scn.nextInt();
    int i=1;
    System.out.println("The multiplication table of "+n+" is");
    while(i<=m){
            int table= n*i;
            System.out.println(i+"*"+n+"="+table);
            i++;
        }
        
     }
}
