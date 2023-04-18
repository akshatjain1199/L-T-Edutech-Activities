

import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		List<User> list=new ArrayList<>();
        System.out.println("Enter the user detail in CSV format");
		String s = sc.nextLine();
		String[] splitted = s.split(",");
		User us = new User(splitted[0], splitted[1], splitted[2], splitted[3]);

		System.out.format("%-5s %-10s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password") ;
		UserDAO dao=new UserDAO();
		dao.insertDetails(us);
		list=dao.getAllUser();
		for(User it: list){
		    System.out.format("%-5s %-10s %-15s %-10s %s\n", it.getId(),it.getName(),it.getContactDetail(),it.getUsername(),it.getPassword());
		}
	}
}


