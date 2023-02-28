import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month:");
        int m=sc.nextInt();
          System.out.println("Enter the year:");
        int y=sc.nextInt();
        switch(m)
        {
            case 1: System.out.println("January of "+ y+" has 31 days.");
            break;
            case 2:
            if((y%4==0 && y %400==0)|| y%100!=0 ){
            System.out.println("February of "+ y+" has 29 days.");
            }
                else
                {
                 System.out.println("February of "+ y+" has 28 days.");
                }
                  break;
                 case 3: System.out.println("March of "+ y+" has 31 days.");
                  break;
                 case 4: System.out.println("April of "+ y+" has 30 days.");
                  break;
                 case 5:System.out.println("May of "+ y+" has 31 days.");
                  break;
case 6: System.out.println("June of "+ y+" has 30 days.");
                 break;
                case 7: System.out.println("July of "+ y+" has 31 days.");
                 break;
                case 8: System.out.println("August of "+ y+" has 31 days.");
                 break;
                case 9: System.out.println("September of "+ y+" has 30 days.");
                 break;
                case 10: System.out.println("October of "+ y+" has 31 days.");
                 break;
                case 11: System.out.println("November of "+ y+" has 30 days.");
                 break;
                case 12: System.out.println("Decemberof "+ y+" has 31 days.");
                 break;
                 default: System.out.println("Invalid Month");
        }
     }
}
