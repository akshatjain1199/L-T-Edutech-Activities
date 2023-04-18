public class User {
	//write your code here
	private long id;
	private String name;
	private String mobileNumber;
	private String username;
	private String password;

	public User(long id,String name,String mobileNumber,String username,String password){
		this.id=id;
		this.name=name;
		this.mobileNumber=mobileNumber;
		this.username=username;
		this.password=password;
	}
	
	public long getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public String getPassword(){
		return password;
	}
}
