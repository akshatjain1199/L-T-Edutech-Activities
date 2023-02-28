import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the first value :");
    int a= scn.nextInt();
    System.out.println("Enter the second value :");
    int b= scn.nextInt();
    System.out.println("Enter the choice from the menu");
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");
    int choice = scn.nextInt();
    switch(choice) {
        case 1:
        System.out.println("The value after Addition is "+(a+b)+".");

        break;
        case 2:
        System.out.println("The value after Subtraction is "+(a-b)+".");
        break;
        case 3:
        System.out.println("The value after Multiplication is "+(a*b)+".");
        break;
        case 4:
        if(b==0){
     
        }
        else{
            System.out.println("The value after Division is "+(a/b)+".");
        }
        break;
        default:
        System.out.println("Invalid choice");

    }
     }
}
