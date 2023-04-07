public class Customer extends User {
    String customerId;
    User user;
    Customer(){}
    Customer(String customerId,User user){
        this.customerId=customerId;
        this.user=user;
    }
    public String getCustomerId() {
    return customerId;
    }


    public void setCustomerId(String customerId) {
    this.customerId = customerId;
    }


    public User getUser() {
    return user;
    }


    public void setUser(User user) {
    this.user = user;
    }


}
