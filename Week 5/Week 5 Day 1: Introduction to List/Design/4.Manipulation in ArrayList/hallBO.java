import java.util.ArrayList;
import java.util.List;

public class HallBO {
	public String[] headers = {"Name", "Contact Number", "Cost per Day", "Owner Name"};
	public List<Hall> getHallList() {
		List<Hall> hallList=new ArrayList<>();
		hallList.add(new Hall("SPK hall","12345",Double.parseDouble("10000"),"John"));
		hallList.add(new Hall("DRG hall","67890",Double.parseDouble("15000"),"Joe"));
		hallList.add(new Hall("EFG hall","45678",Double.parseDouble("20000"),"Jack"));
		return hallList;
	}
	
	public void displayAll(List<Hall> hallList) {
		System.out.printf("%-20s%-20s%-20s%-20s", headers[0], headers[1], headers[2], headers[3]);
		for(Hall h : hallList){
			System.out.printf("%-20s%-20s%-20s%-20s", h.getName(), h.getContactNumber(), h.getCostPerDay(), h.getOwnerName());
		}
	}
}
