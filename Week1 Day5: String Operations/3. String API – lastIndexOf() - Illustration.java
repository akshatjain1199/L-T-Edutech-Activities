import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the string");
    String s= scn.nextLine();
    System.out.println("Enter the string to be searched");
    String search= scn.nextLine();
    System.out.println("The index of last occurence of \""+search+" \" is "+s.lastIndexOf(search,s.length()-1));
    System.out.println("Enter the index limit");
    int indexlimit= scn.nextInt();
    System.out.println("First occurence of \""+search+"\" from "+indexlimit+"th index backwards is "+s.lastIndexOf(search,indexlimit));
     }
}
