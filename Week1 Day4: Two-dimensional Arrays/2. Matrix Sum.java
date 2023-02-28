import java.util.*;
public class Main {
    public static void main(String args[]){
    Scanner scn= new Scanner(System.in);
    int m = scn.nextInt();
    int n= scn.nextInt();
    int[][] matrix= new int[m][n];
    for(int i=0;i<=m-1;i++){
        for(int j=0;j<=n-1;j++){
            matrix[i][j]= scn.nextInt();
        }
    }
    int sum=0;
    for(int i=0;i<=m-1;i++){
        for(int j=0;j<=n-1;j++){
            sum=sum+matrix[i][j];
            }
        }
    System.out.println("The sum of the elements in the matrix is "+sum);
    }
}

