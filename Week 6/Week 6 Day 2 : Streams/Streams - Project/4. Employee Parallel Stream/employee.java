class Employee{
    private String name;
    private Double salary;
    
    Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }
    String getName(){
        return this.name;
    }
    Double getSalary(){
        return this.salary;
    }
    
    public String toString() {
        //Fill your code here
        return String.format("%-15s%-15s",name,salary);
    } 
}



