import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    char c= scn.next().charAt(0);
    if(c >='a' && c<='z')
    {
        System.out.println(c+" is lowercase letter");
    }       
    else if(c>='A' &&  c<='Z')
    {
        System.out.println(c+" is uppercase letter");
    }
    else{
     System.out.println(c+" is neither an uppercase or lowercase letter");
     }
    }
}
