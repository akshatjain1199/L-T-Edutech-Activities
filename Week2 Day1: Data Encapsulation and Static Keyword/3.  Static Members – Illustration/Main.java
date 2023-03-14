import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StaticIllustration obj1 = new StaticIllustration();
        System.out.println("Enter Object 1 details");
        System.out.println("Enter i1");
        obj1.setI1(scanner.nextInt());
        System.out.println("Enter i2");
        StaticIllustration.setI2(scanner.nextInt());
        System.out.print("Object 1 Details : ");
        StaticIllustration.displayDetails(obj1);

        StaticIllustration obj2 = new StaticIllustration();
        System.out.println("Enter Object 2 details");
        System.out.println("Enter i1");
        obj2.setI1(scanner.nextInt());
        System.out.println("Enter i2");
        StaticIllustration.setI2(scanner.nextInt());
        System.out.print("Object 2 Details : ");
        StaticIllustration.displayDetails(obj2);

        System.out.print("Object 1 Details : ");
        StaticIllustration.displayDetails(obj1);
    }
}
