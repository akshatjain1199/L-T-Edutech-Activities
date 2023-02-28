import java.util.*;
public class Main{
    public static void main(String[] args){
    System.out.println("Enter the total number of people");	     
    Scanner scn= new Scanner(System.in);
    int totalpeople = scn.nextInt();

 int  day1=(2*totalpeople)/7 ;
 int   day2= day1*2;
    int day3= day1/2;
    System.out.println("Number of attendees on day 1 : "+day1);
    System.out.println("Number of attendees on day 2 : "+day2);
    System.out.println("Number of attendees on day 3 : "+day3);
    }
}
