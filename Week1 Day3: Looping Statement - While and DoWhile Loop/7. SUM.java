import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	int n;
	int sum=0;
	do{
		n= scn.nextInt();
		if(n!=-999){
			sum=sum+n;
		}
	}
	while(n!=-999);{
System.out.println("The sum is"+sum);
	}

	}

}
