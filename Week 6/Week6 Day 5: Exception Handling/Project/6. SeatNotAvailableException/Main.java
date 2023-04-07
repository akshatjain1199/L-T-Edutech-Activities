import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the show:");
        int size=s.nextInt();
        System.out.println("Enter the number of seats to be booked:");
        int num_of_seats=s.nextInt();
        int seats[][]=new int[size][size];
        int count=0;

        try {
            for(int i = 0; i < num_of_seats; i++)
            {
                System.out.println("Enter the seat number "+(i+1));
                count=s.nextInt();
                if(count>=size*size)
                {
                    throw new ArrayIndexOutOfBoundsException(""+count);
                }
                int row=count/size;
                int col=count%size;
                if(seats[row][col]==0)
                {
                    seats[row][col]=1;
                }
                else {
                    throw new SeatNotAvailableException("Already Booked");
                }

            }
        }catch(SeatNotAvailableException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("The seats booked are:");
            for(int i=0;i<size;i++)
            {
                {
                    for(int j=0;j<size;j++)
                    {
                        System.out.print(seats[i][j]+" ");
                    }
                    System.out.println("");
                    s.close();
                }
            }
        }
    }
}

