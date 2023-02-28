// Java code to demonstrate the working.

import java.util.Scanner;

class Week1Day4_2DArray_OX {

    private static void printRect0X(int m, int n) {
        int i, k = 0, l = 0;

        int r = m, c = n;

        char a[][] = new char[m][n];
        char x = 'X';
        while (k < m && l < n) {
            for (i = l; i < n; ++i)
                a[k][i] = x;
            k++;

            for (i = k; i < m; ++i)
                a[i][n - 1] = x;
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i)
                    a[m - 1][i] = x;
                m--;
            }

            if (l < n) {
                for (i = m - 1; i >= k; --i)
                    a[i][l] = x;
                l++;
            }

            x = (x == '0') ? 'X' : '0';
        }

        for (i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        printRect0X(rows, cols);
    }
}
