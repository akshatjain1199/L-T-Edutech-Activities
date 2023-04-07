
public class User implements Comparable<User>
{
    private String name;
    private String mobileNumber;
    private String username;
    private String password;

    public User() 
	{
        super();
    }

    public User(String name, String mobileNumber, String username, String password) 
	{
        super();
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }

    public String getName() 
	{
        return name;
    }

    public void setName(String name) 
	{
        this.name = name;
    }

    public String getMobileNumber() 
	{
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) 
	{
        this.mobileNumber = mobileNumber;
    }

    public String getUsername() 
	{
        return username;
    }

    public void setUsername(String username) 
	{
        this.username = username;
    }

    public String getPassword() 
	{
        return password;
    }

    public void setPassword(String password) 
	{
        this.password = password;
    }

  
    public String toString() 
	{
        return String.format("%-15s%-15s", name, mobileNumber, username, password);
    }

    public int compareTo(User user) 
	{
        return this.name.compareTo(user.getName());
    }
}
