import java.util.*;
import java.io.*;

public class Main 
{
    public static void main(String[] args)throws Exception
    {
         // fill the code
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the shape\n1.Circle\n2.Rectangle\n3.Triangle");
         int n=sc.nextInt();
		
         if(n==1)
        {
               // fill the code
                System.out.println("Enter the radius:");
                double radius = sc.nextDouble();
                Circle c = new Circle(radius);
                c.computeArea();
                System.out.printf("Area of circle is %.2f\n", c.getArea());

        }
        else if(n==2)
        {
               // fill the code
               System.out.println("Enter the length and breadth:");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                Rectangle r = new Rectangle(length, breadth);
                r.computeArea();
                System.out.printf("Area of rectangle is %.2f\n", r.getArea());
            }
        else if(n==3)
        {
                  // fill the code
              System.out.println("Enter the base and height:");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                Triangle t = new Triangle(base, height);
                t.computeArea();
                System.out.printf("Area of triangle is %.2f\n", t.getArea());
 }
        else
        {
             System.out.format("Invalid choice");
        }
	}
}
