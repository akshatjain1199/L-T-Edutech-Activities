import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        
        if (m <= 2 || n <= 2) {
            return;
        }
        
        char[][] arr = new char[m][n];
        
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        char current = 'X';
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = current;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = current;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = current;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = current;
                }
                left++;
            }
            current = current == 'X' ? '0' : 'X';
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
