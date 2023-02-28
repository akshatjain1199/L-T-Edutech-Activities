import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	int n= scn.nextInt();
	int[] arr= new int[n];
	for(int i= 0 ;i<=n-1;i++){
		arr[i]= scn.nextInt();
	}
	int distinct=0;
	for(int i=0;i<=n-1;i++){
		boolean isdistinct=true;
		for (int j=0;j<=i-1;j++){
			if(arr[i]==arr[j]){
				isdistinct= false;
				break;

			}
		}
		if(isdistinct){
			distinct++;
		}
	}
	System.out.println(distinct);
	}

}
