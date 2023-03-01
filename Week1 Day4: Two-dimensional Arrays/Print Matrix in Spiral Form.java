import java.util.*;

public class Main {
    public static void main(String args[]){
    Scanner scn= new Scanner(System.in);
    int m= scn.nextInt();
    int n= scn.nextInt();
    int[][] spiral=new int[m][n];
    for(int i=0;i<=m-1;i++){
        for(int j=0;j<=n-1;j++){
            spiral[i][j]= scn.nextInt();
        }
    }
    int minr=0;
    int minc=0;
    int maxr= spiral.length-1;
    int maxc= spiral[0].length-1;
    int totalelements=n*m;
    int count=0;
    while(count<totalelements){
        if(count<totalelements){
            for(int i=minr,j=minc;j<=maxc;j++){
                System.out.print(spiral[minr][j]+" ");
                count++;
            }
        }
        minr++;
        if(count<totalelements){
            for(int i=minr,j=maxc;i<=maxr;i++){
                System.out.print(spiral[i][maxc]+" ");
                count++;
    }
    }
    maxc--;
    if(count<totalelements){
            for(int i=maxr,j=maxc;j>=minc;j--){
                System.out.print(spiral[maxr][j]+" ");
                count++;
}
    }
    maxr--;
    if(count<totalelements){
            for(int i=maxr,j=minc;i>=minr;i--){
                System.out.print(spiral[i][minc]+" ");
                count++;
            }
    }
    minc++;
    }
    System.out.println();
    }
}
