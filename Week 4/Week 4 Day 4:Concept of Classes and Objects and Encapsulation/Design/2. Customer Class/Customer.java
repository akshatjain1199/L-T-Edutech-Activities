
class Customer {
    private String customerName;
    private String customerEmail;
    private String customerType;
    private String customerLocation;

    public Customer(String name, String email, String type, String location) {
        this.customerName = name;
        this.customerEmail = email;
        this.customerType = type;
        this.customerLocation = location;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }
}
