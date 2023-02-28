import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];

        System.out.println("Enter the 3x3 matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        int[][] matrix2 = new int[4][4];
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = matrix1[i][j];
                rowSum += matrix1[i][j];
            }
            matrix2[i][3] = rowSum;
        }


        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix1[i][j];
            }
            matrix2[3][j] = colSum;
        }


        int fourthRowSum = 0, fourthColSum = 0;
        for (int i = 0; i < 3; i++) {
            fourthRowSum += matrix2[3][i];
            fourthColSum += matrix2[i][3];
        }
        matrix2[3][3] = fourthRowSum;

    
        System.out.println("The sum matrix is");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
