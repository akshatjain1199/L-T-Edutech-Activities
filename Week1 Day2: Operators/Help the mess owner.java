import java.util.*;
public class Main{
    public static void main(String[] args){    	     
           System.out.println("Cost of item:");
           Scanner scn= new Scanner(System.in);
           int cost= scn.nextInt();
           System.out.println("Number of items:");
           int items = scn.nextInt();
           int totalcost= cost*items;
           System.out.println("Total cost is Rs."+totalcost);
    }
}
