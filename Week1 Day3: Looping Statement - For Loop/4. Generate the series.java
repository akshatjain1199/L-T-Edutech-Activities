import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	int n= scn.nextInt();
	int start= 3;
	System.out.print(start+" ");
	for(int i=0;i<n-1;i++)
	{
		start=start*2 +1;
		System.out.print(start+" ");
	}
	System.out.println();
	}


}
