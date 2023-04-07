public class Hall {
	private String name; 
	private String contactNumber; 
	private double costPerDay; 
	private String ownerName; 

	public void setName(String name){
		this.name = name;
	}
	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}
	public void setCostPerDay(double cost){
		this.costPerDay = cost;
	}
	public void setOwnerName(String owner){
		this.ownerName = owner;
	}

	public String getName(){
		return this.name;
	}
	public String getContactNumber(){
		return this.contactNumber;
	}
	public double getCostPerDay(){
		return this.costPerDay;
	}
	public String getOwnerName(){
		return this.ownerName;
	}


	Hall(String name, String contact, double cost, String owner){
		this.setName(name);
		this.setContactNumber(contact);
		this.setCostPerDay(cost);
		this.setOwnerName(owner);
	}
}
