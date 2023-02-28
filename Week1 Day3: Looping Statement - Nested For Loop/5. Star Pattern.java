import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    try {
      int n = scn.nextInt();
      for (int i = 1; i <= n; i++) {
        for (int j = i; j <= n; j++) {
          if (j < i) {
            continue;
          }
          System.out.print("*");
        }
        System.out.println();
      }
    } catch (Exception e) {
      System.err.println("Invalid input");
    } finally {
      scn.close();
    }
  }
}
