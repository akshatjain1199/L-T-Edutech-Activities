import java.util.*; 
import java.util.stream.*; 


class Main
{
    public static void main(String args[]) {
        //Fill your code here
        Scanner sc= new Scanner(System.in);
        List<Expenses> l= new ArrayList<>();
        System.out.println("Enter expense for food");
        Double f= sc.nextDouble();
        System.out.println("Enter expense for rent");
        Double r=sc.nextDouble();
        System.out.println("Enter expense for shopping");
        Double s=sc.nextDouble();
        System.out.println("Enter expense for groceries");
        Double g= sc.nextDouble();
        System.out.println("Enter expense for electricity");
        Double e=sc.nextDouble();


        l.add(new Expenses("food",f));
        l.add(new Expenses("rent",r));
        l.add(new Expenses("shopping",s));
        l.add(new Expenses("groceries",g));
        l.add(new Expenses("elec",e));


        System.out.println("Enter salary");
        Double sal= sc.nextDouble();
        Double exp=l.stream().map(Expenses::getCost).reduce(0.0,Double::sum);
        if(exp<=sal){
            System.out.println("Savings amount will be Rs."+(sal-exp));
        }
        else{
            System.out.println("Expenses exceeds Salary");
        }
        
    }
}
