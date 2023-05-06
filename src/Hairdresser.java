import java.sql.Time;

public class Hairdresser extends Person {
    public WorkingHours workingHours;

    public Hairdresser(){

    }

    //Detta används i Hairsalon.java när det sätter ut de olika tiderna frisörerna jobbar, samt vad de heter
    public Hairdresser(int startWorkingHour, int endWorkingHour, String hairdresserName){

        workingHours = new WorkingHours(startWorkingHour, endWorkingHour);

        name = hairdresserName;

    }


}