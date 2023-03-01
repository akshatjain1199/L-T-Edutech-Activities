import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the string");
    String s= scn.nextLine();
    String updated= s.replaceAll("\\s+"," ");
    System.out.println("The processed string is "+updated);
     }
}
