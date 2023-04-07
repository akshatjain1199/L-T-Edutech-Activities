import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) throws Exception {
        //fill your code here
        Scanner sc= new Scanner(System.in);
        List<Book> b= new ArrayList<>();
        List<String>hs=new ArrayList<>();
        try{
            System.out.println("Enter no. of Books");
            int n= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the book details in CSV format");
            for(int i=0;i<n;i++){
                String s[]=sc.nextLine().split(",");
                if(!hs.contains(s[0])){
                    hs.add(s[0]);
                    b.add(new Book(s[0],s[1],s[2],Double.parseDouble(s[3])));
                }
            }
            System.out.println("List of Distinct Books");
            System.out.format("%-20s %-20s %-10s %s\n","Title","Category","Author","Price");
            b.forEach(System.out::println);
        }catch(Exception e){
            System.out.println(e);
        }


    }
    
}
