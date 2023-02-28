import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int year= scn.nextInt();
    if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
    {
            System.out.println(year+" is a leap year");
    }
    else
    {
        System.out.println(year+" is not a leap year");
    }
        
        
     }
}
