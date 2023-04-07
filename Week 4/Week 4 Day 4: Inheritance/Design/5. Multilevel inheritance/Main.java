import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Stall Type");
        System.out.println("1.Silver Stall");
        System.out.println("2.Gold Stall");
        System.out.println("3.Platinum Stall");
        int choice = scanner.nextInt();
       

        if(choice==1 || choice==2 || choice==3)
        {
            scanner.nextLine();
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost" +
                    ((choice == 2) ? ",Number of TV set" : "") + ((choice == 3) ? ",Number of TV set,Number of Projectors)" : ")"));
            try {
                if(scanner.hasNextLine()) {
                    String[] stallDetails = scanner.nextLine().split(",");

            // Rest of the code
            switch (choice) {
                case 1:
                    SilverStall silverStall = new SilverStall(stallDetails[0], stallDetails[1], stallDetails[2], Integer.parseInt(stallDetails[3]));
                    System.out.println("Stall Name:" + silverStall.getName());
                    System.out.println("Details:" + silverStall.getDetail());
                    System.out.println("Owner Name:" + silverStall.getOwner());
                    System.out.println("Total Cost:" + silverStall.getCost());
                    break;
                case 2:
                    GoldStall goldStall = new GoldStall(stallDetails[0], stallDetails[1], stallDetails[2], Integer.parseInt(stallDetails[3]), Integer.parseInt(stallDetails[4]));
                    System.out.println("Stall Name:" + goldStall.getName());
                    System.out.println("Details:" + goldStall.getDetail());
                    System.out.println("Owner Name:" + goldStall.getOwner());
                    System.out.println("TV Sets:" + goldStall.getTvSet());
                    System.out.println("Total Cost:"+goldStall.getTotalCost());
                    break;
                case 3:
                    PlatinumStall platinumStall = new PlatinumStall(stallDetails[0], stallDetails[1], stallDetails[2], Integer.parseInt(stallDetails[3]), Integer.parseInt(stallDetails[4]),Integer.parseInt(stallDetails[5]));
                    System.out.println("Stall Name:"+platinumStall.getName());
                    System.out.println("Details:"+platinumStall.getDetail());
                    System.out.println("Owner Name:"+platinumStall.getOwner());
                    System.out.println("TV Sets:"+platinumStall.getTvSet());
                    System.out.println("Projectors:"+platinumStall.getProjector());
                    System.out.println("Total Cost:"+platinumStall.getTotalCost());
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } 
            }
            catch (Exception e)
            {
                System.out.println("Breaking...");
            }
            finally
            {
                scanner.close();
            }

    }
}
}

