import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        //fill your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the maximum price of the product");
        Double p= sc.nextDouble();
        List<Product> l= new Product().filterProducts(p);
        if(l.isEmpty()){
            System.out.println("No products found within the given price");
        }
        else{
            System.out.println("List of Filtered Products");
            System.out.format("%-20s %-20s %-20s %-10s %s\n","Name","Brand","Category","Color","Price");
            l.forEach(System.out::println);
        }
    }
}
