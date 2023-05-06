import java.util.ArrayList;
import java.util.List;

public class HairSalon {

    public String name;

    public HairSalon(){

    }

    public HairSalon(String salonName){
        name = salonName;
    }

    //Skapar en ny bokning
    public void createBooking(){

        Booking booking = new Booking(this);

    }

}
