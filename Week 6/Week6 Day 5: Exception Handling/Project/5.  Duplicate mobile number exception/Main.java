import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the contact details");
        String details[]=s.nextLine().split(",");
        String mobile=details[0];
        String alter_mob=details[1];
        String Land=details[2];
        String email=details[3];
        String address=details[4];

        try{
            ContactDetailBO.validate(mobile,alter_mob);
            ContactDetail c=new ContactDetail(mobile,alter_mob,Land,email,address);
            System.out.println(c.toString());
        }
        catch (DuplicateMobileNumberException e)
        {
            System.out.println(e);
        }
        finally {
            s.close();
        }


    }
}
