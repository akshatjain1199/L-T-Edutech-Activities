import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int m = n * 3 / 2; 
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j < n / 2) {
                    System.out.print("( ");
                } else if (j < m - n / 2) {
                    System.out.print("# ");
                } else {
                    System.out.print(") ");
                }
            }
            System.out.println();
        }
    }
}
