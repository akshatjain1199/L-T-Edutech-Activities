import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws Exception{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter branding expenses");
		int branding = sc.nextInt();
		System.out.println("Enter travel expenses");
		int travel = sc.nextInt();
		System.out.println("Enter food expenses");
		int food = sc.nextInt();
		System.out.println("Enter logistics expenses");
		int logistics = sc.nextInt();
		
		double total_expenses = (branding+travel+food+logistics);
		System.out.println("Total expenses: Rs."+(String.format("%.2f",total_expenses)));
		System.out.println("Branding expenses percentage: "+(String.format("%.2f",(branding/total_expenses)*100)+"%"));
		System.out.println("Travel expenses percentage: "+(String.format("%.2f",(travel/total_expenses)*100)+"%"));
		System.out.println("Food expenses percentage: "+(String.format("%.2f",(food/total_expenses)*100)+"%"));
		System.out.println("Logistics expenses percentage: "+(String.format("%.2f",(logistics/total_expenses)*100)+"%"));

	}
}
