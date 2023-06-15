import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception {

    //  Fill your code
    Scanner sc = new Scanner(System.in);

    double be, te, fe, le;

    System.out.println("Enter branding expenses");
    be = sc.nextDouble();
    System.out.println("Enter travel expenses");
    te = sc.nextDouble();
    System.out.println("Enter food expenses");
    fe = sc.nextDouble();
    System.out.println("Enter logistics expenses");
    le = sc.nextDouble();

    double total = be + te + fe + le;
    be = (be / total) * 100;
    te = (te / total) * 100;
    fe = (fe / total) * 100;
    le = (le / total) * 100;

    System.out.println("Total expenses: Rs." + String.format("%.2f", total));
    System.out.println("Branding expenses percentage: " + String.format("%.2f", be) + "%");
    System.out.println("Travel expenses percentage:" + String.format(" %.2f", te) + "%");
    System.out.println("Food expenses percentage:" + String.format(" %.2f", fe) + "%");
    System.out.println("Logistics expenses percentage:" + String.format(" %.2f", le) + "%");
  }
}
