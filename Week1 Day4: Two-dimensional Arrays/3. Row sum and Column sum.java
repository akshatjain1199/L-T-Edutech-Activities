import java.util.*;

public class Main {
    public static void main(String args[]){
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the row size");
    int m= scn.nextInt();
    System.out.println("Enter the column size");
    int n= scn.nextInt();
    System.out.println("Enter the matrix values");
    int[][] matrix= new int[m][n];
    for(int i=0;i<=m-1;i++){
        for(int j=0;j<=n-1;j++){
            matrix[i][j]= scn.nextInt();
        }
    }
    System.out.println("The matrix is");
    for(int i=0;i<=m-1;i++){
        for(int j=0;j<=n-1;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    for(int i=0;i<=m-1;i++){
        int rowsum=0;
        for(int j=0;j<=n-1;j++){
            rowsum= rowsum+matrix[i][j];
        }
        System.out.println("Row "+(i+1)+" sum is "+rowsum);
    }
    for(int j=0;j<=n-1;j++){
        int colsum=0;
        for(int i=0;i<=m-1;i++){
            colsum=colsum+matrix[i][j];
        }
        System.out.println("Column "+(j+1)+" sum is "+colsum);
    }
    }
}

