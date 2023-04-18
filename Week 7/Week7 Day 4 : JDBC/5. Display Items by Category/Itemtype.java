public class ItemType {
	//your code goes here...
	private long id;
	private String name;
	private double deposit;
	private double costPerDay;

	public ItemType(long id,String name,double deposit,double costPerDay){
		this.id=id;
		this.name=name;
		this.deposit=deposit;
		this.costPerDay=costPerDay;
	}

	public long getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getDeposit(){
		return deposit;
	}
	public double getCostPerDay(){
		return costPerDay;
	}
	public String toString(){
	return	String.format("%-5s %-15s %-12s %s\n",getId(),getName(),String.format("%.1f",getDeposit()),String.format("%.1f",getCostPerDay()));
	}
}
