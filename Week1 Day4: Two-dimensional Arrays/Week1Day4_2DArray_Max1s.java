import java.util.Scanner;

public class Week1Day4_2DArray_Max1s {
    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();

        int a[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

        int rowNo = 0;
        int finCount = 0;
        for (int i = 0; i < rows; i++) {
            int rowCount = 0;
            for (int j = 0; j < cols; j++) {
                if (a[i][j] == 1)
                    rowCount += 1;
                if (rowCount > finCount) {
                    finCount = rowCount;
                    rowNo = i;
                }
            }
        }
        System.out.println(rowNo);
    }
}
