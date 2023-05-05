import java.sql.Time;

public class Hairdresser extends Person {

    //kan skapa bokningar och avboka alla bokningar

    public WorkingHours workingHours;

    public Hairdresser(int startWorkingTime, int endWorkingTime){

        workingHours = new WorkingHours();

        workingHours.startHour = startWorkingTime;
        workingHours.endHour = endWorkingTime;

    }


}

