import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        ArrayList<Account> list=new ArrayList<>();
        for(int i=1;i<=2;i++){
        System.out.println("Enter the details of Account"+i);
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        System.out.println("Enter Email:");
        String email=sc.nextLine();
        System.out.println("Enter mobile number:");
        String mob=sc.nextLine();
        System.out.println("Enter Address:");
        String add=sc.nextLine();
        System.out.println("Enter Password:");
        String pwd=sc.nextLine();
        User u=new User(name,email,pwd,email,mob,add);
        System.out.println("Enter Customer Id:");
        String cid=sc.nextLine();
        Customer c=new Customer(cid,u);
        System.out.println("Enter Account Id:");
        int aid=Integer.parseInt(sc.nextLine());
        System.out.println("Enter the Account Number:");
        String Ano=sc.nextLine();
        System.out.println("Enter Account Type:");
        String Atype=sc.nextLine();
        AccountType at=new AccountType(Atype);
        Account a=new Account(aid,Ano,at,c);
        list.add(a);
        }
        ArrayList<String> lstr=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Role r=new Role();
            String str=r.toString(list.get(i));
            lstr.add(str);
        }
        System.out.println("Account Details");
        System.out.println("Customer Id     Customer Name   Customer Username Customer MobileNumber Customer Email  Customer Address Account Number  Account Type   ");
        System.out.println(lstr.get(0));
        String[] s1=lstr.get(0).split("\\s+");
        System.out.println(lstr.get(1));
        String[] s2=lstr.get(1).split("\\s+");
        if(s1[6].equals(s2[6]))
            System.out.println("Both Account Numbers are same");
        else
            System.out.println("Both Account Numbers are different");




    }
    
}
