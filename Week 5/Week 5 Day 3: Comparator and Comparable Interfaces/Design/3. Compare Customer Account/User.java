public class User {
    String  name;
    String  username;
    String  password;
    String  email;
    String  mobileNumber;
    String  address;
    User(){}
    User(String name,String username,String password,String email,String mobileNumber, String address){
        this.name=name;
        this.password=password;
        this.username=username;
        this.email=email;
        this.mobileNumber=mobileNumber;
        this.address=address;
    }
    public String getName() {
    return name;
    }


    public void setName(String name) {
    this.name = name;
    }
    public String getUsername() {
    return username;
    }


    public void setUsername(String username) {
    this.username = username;
    }


    public String getPassword() {
    return password;
    }


    public void setPassword(String password) {
    this.password = password;
    }


    public String getEmail() {
    return email;
    }


    public void setEmail(String email) {
    this.email = email;
    }


    public String getMobileNumber() {
    return mobileNumber;
    }


    public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    }


    public String getAddress() {
    return address;
    }


    public void setAddress(String address) {
    this.address = address;
    }
}
