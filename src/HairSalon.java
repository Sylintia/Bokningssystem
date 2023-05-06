import java.util.ArrayList;
import java.util.List;

public class HairSalon {

    public String name;

    //Skapar en lista av alla frisörer
    List<Hairdresser> hairdressers = new ArrayList<Hairdresser>();

    public HairSalon(){

    }

    //sätter ut vilka tider de olika frisörerna arbetar och vad de heter
    public HairSalon(String salonName){

        name = salonName;
        hairdressers.add(new Hairdresser(8, 12, "Amanda"));
        hairdressers.add(new Hairdresser(12, 16,  "Sofia"));
        hairdressers.add(new Hairdresser(16, 20, "Smilla"));

    }

    //Skapar en ny bokning
    public void createBooking(){

        Booking booking = new Booking(this);

    }

}
