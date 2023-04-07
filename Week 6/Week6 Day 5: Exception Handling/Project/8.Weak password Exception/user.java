class User {
    private String name;
    private String mobile;
    private String username;
    private String password;

    public User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Override toString() method to display user details
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Mobile: " + mobile + "\n" +
                "Username: " + username + "\n" +
                "Password: " + password + "\n";
    }
}
