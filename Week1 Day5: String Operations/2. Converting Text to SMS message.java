import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    public static void main(String args[]) throws IOException{
        Scanner scn= new Scanner(System.in);
        String s= scn.nextLine();
        s= s.replaceAll("yes","s");
        s= s.replaceAll("you","u");
        s= s.replaceAll("today","2day");
        s= s.replaceAll("why","y");
        System.out.println(s);
    }
}
