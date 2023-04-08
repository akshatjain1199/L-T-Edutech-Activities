import java.text.SimpleDateFormat;
import java.util.*;
class HallBookingBO {
	public static boolean validateHallBooking(List<HallBooking> bookingList,HallBooking booking) throws Exception{
		//fill your code here
        if(bookingList.size()==0){
            return true;
        }
        for(HallBooking hb : bookingList ){
            if(hb.getEventDate().compareTo(booking.getEventDate()) == 0 && hb.getHall().getName().equals(booking.getHall().getName())){
                throw new HallNotAvailableException("Hall Already Booked");
            }
        }
        return true;
	}
}
