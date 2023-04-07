import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //Your code here
        Scanner sc=new Scanner(System.in);
        ArrayList<Hall> obj=new ArrayList<Hall>();
        char choice='Y';
        int flag=0;
        while(choice=='Y'){
            System.out.println("Action");
            System.out.println("1.Add Hall");
            System.out.println("2.Remove Hall");
            System.out.println("Enter your choice");
            int n=Integer.parseInt(sc.nextLine());
            if(n==1){
                        System.out.println("Enter the Hall details in CSV format");
                        String info=sc.nextLine();
                        String  []ar=info.split(",");
                        String nm=ar[0];
                        String cn=ar[1];
                        double cpd=Double.parseDouble(ar[2]);
                        String on=ar[3];
                        Hall ob=new Hall(nm,cn,cpd,on);
                        obj.add(ob);
 
            }
            else if(n==2){
                if(obj.isEmpty()){
                        System.out.println("The list is empty");
                        flag=0;
                        break;
                }
                else{
                    System.out.println("Enter the index of the hall to be removed");
                    int index=Integer.parseInt(sc.nextLine());
                    Hall obb=new Hall();
                    
                    obj.remove(index);
 
                    if(obj.isEmpty()){
                        System.out.println("No Hall details to display");
                    }else{
                        obb.display(obj);
                    }
                    
                }
                    
            }
            else if(n!=1 && n!=2){
                    System.out.println("Please enter a valid choice");
            }
            if(flag==0){
                System.out.println("Do you want to continue?(Y/N)");
                choice=sc.nextLine().charAt(0);
            }
 
        }
    }
}
