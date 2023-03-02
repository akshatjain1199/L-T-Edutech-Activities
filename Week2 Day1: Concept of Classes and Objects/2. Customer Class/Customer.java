class Customer {
    String customerName;
    String customerEmail;
    String customerType;
    String customerAddress;

    Customer(String customerName, String customerEmail, String customerType, String customerAddress) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    String getCustomerName() {
        return customerName;
    }

    String getCustomerEmail() {
        return customerEmail;
    }

    String getCustomerType() {
        return customerType;
    }

    String getCustomerLocation() {
        return customerAddress;
    }

    void displayDetails() {
        System.out.println("\nCustomer Details");
        System.out.println("Name: " + getCustomerName());
        System.out.println("E-mail: " + getCustomerEmail());
        System.out.println("Type: " + getCustomerType());
        System.out.println("Location: " + getCustomerLocation());
    }
}
