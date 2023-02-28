import java.util.*;
public class Main {
    public static void main(String args[]){
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int[] arr1= new int[n];
    for(int i =0;i<=n-1;i++){
        arr1[i]= scn.nextInt();
    }
    int[] arr2= new int[n];
    for(int i=0;i<=n-1;i++){
        arr2[i]= scn.nextInt();
    }
    boolean compatible = true;
for(int i=0;i<=n-1;i++){
        if(arr1[i] < arr2[i])
        {
            compatible= false;
            break;
        }
    }
    if(compatible){
        System.out.println("Compatible");
    }
    else
    {
        System.out.println("InCompatible");
    }
    }
}

