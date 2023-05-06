import java.util.Scanner;

public class Booking {

    int price;
    HairSalon hairSalon;
    Customer customer;
    int bookedTime;
    Hairdresser selectedHairdresser;
    Scanner myScanner = new Scanner(System.in);

    public Booking() {}


    public Booking(HairSalon salon){
        hairSalon = salon;
        createCustomer();
        klippning();
        färgning();
        datum();
        kvitto();
    }

    //Välkommnar kunden till salongen, och frågar efter kundens namn
    void createCustomer(){
        customer = new Customer();
        System.out.println("Hej och välkommen till " + hairSalon.name);
        System.out.println(" ");
        System.out.println("Vad heter du?");
        customer.name = myScanner.nextLine();
        System.out.println("Hej " + customer.name + ", vad kul att du kontaktar oss!");
    }

    //Frågar om kunden vill klippa håret och ger olika förslag på klippningar
    public void klippning(){
        price = 0;
        System.out.println("Vill du klippa dig? (1: Ja, 2: Nej)");
        int klippning = myScanner.nextInt();

        if (klippning == 1){
            price += 200;
            System.out.println("Vill du klippa en ny frisyr, eller bara topparna? (1: ny frisyr, 2: topparna)");
            int frisyr = myScanner.nextInt();

            if (frisyr == 1){
                price += 400;

            } else if (frisyr == 2){
                price += 200;
            }
        } else if (klippning == 2) {
            färgning();
        }
    }

    //Frågar om kunden vill färga håret, om svaret är ja frågar det även om hen vill färga en naturlig eller onaturlig färg, medans om svaret är nej så kommer kunden tas vidar till nästa steg
    public void färgning(){
        System.out.println("Vill du färga håret? (1: Ja, 2: Nej)");
        int färgning = myScanner.nextInt();

        if(färgning == 1){
            System.out.println("Vill du färga en naturlig färg eller inte? (1: Naturlig, 2: Onaturlig)");
            int färg = myScanner.nextInt();

            if(färg == 1){
                price += 1000;
            } else if (färg == 2){
                price += 2000;
            }
        } else if (färgning == 2){
            datum();
        }
    }

    //Frågar vilken tid kunden vill boka, och baserat på svaret så kommer kunden bli tilldelad en av de 3 frisörerna. Det finns även en felsökning som gör att kunden inte kan boka en tid innan 8 eller efter 19.
    public void datum(){

        System.out.println("Vi har öppet 8-20, vilken timme vill du komma? (8-19)");
        bookedTime = myScanner.nextInt();

        if(bookedTime < 8 || bookedTime > 19){
            System.out.println("Vi har inte öppet klockan " + bookedTime);
            datum();
        }

        for(Hairdresser hairdresser : hairSalon.hairdressers){
            if(hairdresser.workingHours.startTime <= bookedTime && bookedTime < hairdresser.workingHours.endTime){
                selectedHairdresser = hairdresser;
            }

        }

    }

    //Skriver ut ett kvitto där det står vilken frisör kunden kommer bli tilldelad, vilken tid bokningen är på, samt hur mycket det kommer kosta
    public void kvitto(){
        System.out.println("Tack för din bokning! Här kommer ditt kvitto:");
        System.out.println(" ");
        System.out.println("Din frisör kommer vara " + selectedHairdresser.name);
        System.out.println("Din bokade tid är klockan " + bookedTime + " och det kommer kosta totalt " + price);

    }

}
