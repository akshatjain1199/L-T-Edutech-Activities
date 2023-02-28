import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	int n= scn.nextInt();
	int[] v1= new int[n];
	for(int i=0;i<=n-1;i++){
		v1[i]=scn.nextInt();
	}
	int[] v2 = new int[n];
	for(int i=0;i<=n-1;i++){
		v2[i]= scn.nextInt();
	}
	Arrays.sort(v1);
	Arrays.sort(v2);
	reversearray(v2);
	int product=0;
	for(int i=0;i<=n-1;i++){
		product=product+ v1[i]*v2[i];
	}
System.out.println(product);
	}
	static void reversearray(int[] arr){

		int left=0;
		int right= arr.length-1;
		while(left<right){
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
}
