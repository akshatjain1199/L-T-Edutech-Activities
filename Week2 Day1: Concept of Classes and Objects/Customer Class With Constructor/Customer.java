public class Customer{
String CustomerName;
String CustomerEmail;
String CustomerType;
String CustomerAddress;

public Customer(){
	this.CustomerName="";
	this.CustomerEmail="";
	this.CustomerType="";
	this.CustomerAddress="";
}	
public Customer(String CustomerName,String CustomerEmail,String CustomerType, String CustomerAddress){
	this.CustomerName=CustomerName;
	this.CustomerEmail=CustomerEmail;
	this.CustomerType=CustomerType;
	this.CustomerAddress=CustomerAddress;
}
	public void displayDetails(){

			System.out.println("Name: "+CustomerName);
			System.out.println("E-mail: "+CustomerEmail);
			System.out.println("Type: "+CustomerType);
			System.out.println("Location: "+CustomerAddress);
	}
	
}
