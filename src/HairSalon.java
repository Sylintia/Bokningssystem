import java.util.ArrayList;
import java.util.List;

public class HairSalon {

    public String name;
    List<Hairdresser> hairdressers = new ArrayList<Hairdresser>();
    List<Booking> bookings = new ArrayList<>();

    public HairSalon(){

    }

    public HairSalon(String salonName){
        name = salonName;
    }
    /*
    public HairSalon(String salonName){

        name = salonName;
        hairdressers.add(new Hairdresser(8, 12, "Amanda"));
        hairdressers.add(new Hairdresser(12, 16, "Sofia"));
        hairdressers.add(new Hairdresser(16, 20, "Smilla"));

    }
    */

    public void createBooking(){

        Booking booking = new Booking(this);

    }

}
