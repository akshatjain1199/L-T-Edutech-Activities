import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        System.out.println("Enter the number of seats to be booked:");
        int booking_seat=s.nextInt();
        int seat[]=new int[100];
    
        int n=0;

        try {
            for (int i = 0; i < booking_seat; i++) {
                System.out.println("Enter the seat number " + (i+1));
                n = s.nextInt();
            
                seat[n-1] = n;
            }
			System.out.println("The seats booked are:");
            for(int i=0;i<seat.length;i++)
            {
                if(seat[i]!=0) {
                    System.out.println(seat[i]);
                }
                else {
                    continue;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

    }
}
