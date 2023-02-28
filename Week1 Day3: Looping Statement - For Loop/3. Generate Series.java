import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int num=4;
        for(int i=0;i<n;i++){
            System.out.println(num+ " ");
            num*=(8/(int)Math.pow(2,i));
        }
    }
}
