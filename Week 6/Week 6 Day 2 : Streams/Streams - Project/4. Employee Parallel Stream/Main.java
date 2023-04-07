import java.util.*; 
import java.io.*; 
import java.nio.file.Files; 
import java.util.regex.*;
import java.util.stream.*; 


class Main
{
    public static void main(String args[]) throws IOException {
        //Fill your code here
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        List<Employee> l=new ArrayList<>();
        while(true){
            String line=br.readLine();
            if(line==null){
                break;
            }
            String s[]= line.split(",");
            l.add(new Employee(s[0],Double.parseDouble(s[1])));
        }
        System.out.format("%-10s%-10s\n","Name","Salary");
        l.forEach(System.out::println);
    }
}


