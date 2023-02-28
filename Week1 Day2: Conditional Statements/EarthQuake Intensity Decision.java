import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    public static void main(String args[]) throws IOException{
    System.out.println("Richter Magnitude:");
    Scanner scn= new Scanner(System.in);
    double magnitude = scn.nextDouble();
    if(magnitude<=2.4)
        System.out.println("Micro");
    else if(magnitude>=2.5 && magnitude<=5.4)
    System.out.println("Light");
    else if(magnitude>=5.5 && magnitude<=6.0)
        System.out.println("Moderate");
    else if(magnitude>=6.1 && magnitude<=6.9)
        System.out.println("Strong");
    else if(magnitude>=7.0 && magnitude<=7.9)
        System.out.println("Major");
    else 
        System.out.println("Great");
    }
}
