import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	int n= scn.nextInt();
	System.out.println("Enter the elements in the array");
	int[] arr= new int[n];
	for(int i=0;i<=n-1;i++){
		arr[i]= scn.nextInt();

	}
int maxCount=1;
int mode= arr[0];
int count =0;
for(int i=0;i<=n-1;i++){
	count =0;
	for(int j=0;j<=n-1;j++){
		if(arr[j]==arr[i]){
			count++;
		}
	}
	if(count >maxCount){
		maxCount=count;
		mode=arr[i];
	}
}if(maxCount==1){
	System.out.println("The mode of the array is none");
}
else{
	System.out.println("The mode of the array is ");
	System.out.println(mode);
}
	}

}
