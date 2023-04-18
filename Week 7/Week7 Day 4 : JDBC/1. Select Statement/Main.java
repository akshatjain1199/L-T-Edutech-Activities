import java.util.*;
public class Main {
	public static void main(String[] args)  {
		List<ItemType> al=new ArrayList<>();
		System.out.format("%-5s %-15s %-10s %s\n","ID","Name","Deposit","Cost per day");
		ItemTypeDAO dao=new ItemTypeDAO();
		al=dao.getAllItemTypes();
		// System.out.println(al);
		for(ItemType it:al){
		    System.out.format("%-5s %-15s %-10s %s\n",it.getId(),it.getName(),it.getDeposit(),it.getCostPerDay());
		}
	}
}
