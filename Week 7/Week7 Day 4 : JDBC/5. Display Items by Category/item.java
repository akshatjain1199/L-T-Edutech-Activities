public class Item {
	//your code goes here...
	private long id;
	private String name;
	private ItemType itemType;
	private String vendor;

	public Item(long id,String name,ItemType itemType,String vendor){
		this.id=id;
		this.name=name;
		this.itemType=itemType;
		this.vendor=vendor;
	}

	public long getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public ItemType getItemType(){
		return itemType;
	}
	public String getVendor(){
		return vendor;
	}

	public String toString(){
	return	String.format("%-5s %-15s %-12s %s\n",getId(),getName(),getItemType().getName(),getVendor());
	}
}
