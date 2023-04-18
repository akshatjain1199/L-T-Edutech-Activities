public class Hall {
	//write your code here
	private long id;
	private String name;
	private String contactNumber;
	private double costPerDay;
	public User owner;

	public Hall(String name,String contactNumber,double costPerDay,User owner){
		this.name=name;
		this.contactNumber=contactNumber;
		this.costPerDay=costPerDay;
		this.owner=owner;
	}
	public Hall(long id,String name,String contactNumber,double costPerDay,User owner){
		this.id=id;
		this.name=name;
		this.contactNumber=contactNumber;
		this.costPerDay=costPerDay;
		this.owner=owner;
	}
	public void setId(long id){
		this.id=id;
	} 
	public long getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getContactNumber(){
		return contactNumber;
	}
	public double getCostPerDay(){
		return costPerDay;
	}
	public User getOwner(){
		return owner;
	}

	public String toString(){
	return	String.format("%-15s%-15s%-15s%-15s",getName(),getContactNumber(),String.format("%.1f",getCostPerDay()),getOwner().getName());
	}
}
