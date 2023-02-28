import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter the  number of elements in the array");
	int n= scn.nextInt();
	System.out.println("Enter the elements in the array");
	int[] arr= new int[n];
	for(int i=0;i<=n-1;i++){
		arr[i]= scn.nextInt();
	}
	Arrays.sort(arr);
	double median;
	if(n%2==0){
		median= (double) (arr[n/2] + arr[n/2-1])/2;
	}
	else{
		median= arr[n/2];
	}
System.out.printf("The median of the array is %.2f", median);
	}

}
