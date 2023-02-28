import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    if(n%7==0 && n%3==0)
    {
        System.out.println(n+" is divisible by both 7 and 3");
    }
        else{
            System.out.println(n+" is not divisible by both 7 and 3");
        }
     }
}
