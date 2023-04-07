public class Role {
    String name;
    Role(){}
    Role(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String setName(){
        return this.name;
    }
    
    
    


    public String toString(Account a){
        Customer c=a.getCustomer();
        User u=c.getUser();
        return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s",c.getCustomerId(),u.getName(),u.getUsername(),u.getMobileNumber(),u.getEmail(),u.getAddress(),a.getAccountNumber(),a.getAccountType().getAccountType());
    }
}
