import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        int m= scn.nextInt();
        int n= scn.nextInt();
        int[][] arr= new int[m][n];
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                arr[i][j]= scn.nextInt();
            }
        }
        int maxonerow=0;
        int maxonecount=0;
        for(int i=0;i<=m-1;i++){
            int onescount=0;
            for(int j=0;j<=n-1;j++){
                if(arr[i][j]==1){
                    onescount++;
                }
            }
            if(onescount>maxonecount){
                maxonerow=i;
                maxonecount=onescount;
            }
        }
        System.out.println(maxonerow);
    }
}

