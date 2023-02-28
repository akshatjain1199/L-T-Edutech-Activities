import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        if (n < 100 || n> 999) {
            System.out.println("no");
        }

        else
        {

        int a=n/100;
        int b=n/10;
        b=b%10;
        int c=n%10;
            if (b>=a && c>=b) 
            System.out.println("yes");
            else if(b>=c && a>=b)
            System.out.println("yes");
            else
            System.out.println("no");
        }

        }
    }
