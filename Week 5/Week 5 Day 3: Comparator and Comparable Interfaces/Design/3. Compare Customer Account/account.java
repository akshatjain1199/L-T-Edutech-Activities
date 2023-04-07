public class Account {
    int id;
    String accountNumber;
    AccountType accountType;
    Customer customer;
    Account(){}
    Account(int id,String accountNumber,AccountType accountType,Customer customer){
        this.id=id;
        this.accountNumber=accountNumber;
        this.customer=customer;
        this.accountType=accountType;
    }
    public String getAccountNumber() {
    return accountNumber;
    }


    public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    }


    public AccountType getAccountType() {
    return accountType;
    }


    public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
    }


    public Customer getCustomer() {
    return customer;
    }


    public void setCustomer(Customer customer) {
    this.customer = customer;
    }


    public int getId() {
    return id;
    }


    public void setId(int id) {
    this.id = id;
    }
}
