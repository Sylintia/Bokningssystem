import java.util.Scanner;

public class Booking {

    int price;
    int time;
    HairSalon hairSalon;
    Customer customer;
    int bookedTime;
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
        System.out.println("Vill du klippa dig? (1: Ja, 2: Nej)");
        int klippning = myScanner.nextInt();

        if (klippning == 1){
            price += 200;
            System.out.println("Vill du klippa en ny frisyr, eller bara topparna? (1: ny frisyr, 2: topparna)");
            int frisyr = myScanner.nextInt();

            if (frisyr == 1){
                price += 400;
                time += 30;

            } else if (frisyr == 2){
                price += 200;
                time += 20;
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
                time += 120;
            } else if (färg == 2){
                price += 2000;
                time += 120;
            }
        } else if (färgning == 2){
            datum();
        }
    }

    //Frågar vilken tid kunden vill boka
    public void datum(){

        System.out.println("Vilken tid vill du boka?");
        bookedTime = myScanner.nextInt();

    }

    //Skriver ut ett kvitto, där det står vilken tid bokningen är på, samt hur mycket det kommer kosta och hur lång tid det kommer ta
    public void kvitto(){
        System.out.println("Tack för din bokning! Här kommer ditt kvitto:");
        System.out.println(" ");
        System.out.println("Din bokade tid är klockan " + bookedTime + ", det kommer kosta totalt " + price + "kr, och det kommer ta " + time /60 + " timmar och " + time %60 + " minuter");

    }

}
