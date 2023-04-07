import java.io.*;
import java.util.*;


public class Main {
    public static void main(String args[]) throws Exception {
        
        //Fill your code
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of details");
        int n= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter contact details");
        Contact<?,?> [] cnt= new Contact[n];
        for(int i=0;i<n;i++){
            String contact[]= sc.nextLine().split(",");
            if(contact[0].startsWith("91")){
                cnt[i]= new Contact<>(contact[0],contact[1]);
            }
        }
        System.out.println("List of contact numbers");
        for(Contact<?,?> x: cnt){
            if(x!=null){
            x.print();
            }
        }
        
    }
}
