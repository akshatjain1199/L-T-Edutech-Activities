import java.util.*;

public class Main {
    public static void main(String args[]){
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int[] price= new int[n];
    int[] span= new int[n];
    
    span[0]=1;
    price[0]=scn.nextInt();
    for(int i=1;i<=n-1;i++){
        price[i]=scn.nextInt();
        int spanval=1;
        int j=i-1;
        while(j>=0 && price[i]>=price[j]){
            spanval= spanval+span[j];
            j=j-span[j];

        }
        span[i]=spanval;
    }
    for(int i=0;i<=n-1;i++){
        System.out.println(span[i]);
    }
    }
}

