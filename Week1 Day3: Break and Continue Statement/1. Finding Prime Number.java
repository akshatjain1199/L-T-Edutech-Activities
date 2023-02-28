import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	int n= scn.nextInt();
	if(n<2){
		System.out.println("Not prime");
	}
	boolean isprime=true;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0){
			isprime=false;
			break;
		}
	}
	if(isprime)
	{
	System.out.println("Prime");
	}
	else{
		System.out.println("Not prime");
	}
	}
}
