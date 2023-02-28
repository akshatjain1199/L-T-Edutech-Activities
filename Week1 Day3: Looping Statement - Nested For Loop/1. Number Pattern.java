import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=i;j<=n;j++)
        {
            System.out.print(j+" ");
            
        }
        System.out.println();
    }
        
     }
}
