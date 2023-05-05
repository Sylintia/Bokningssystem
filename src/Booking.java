import java.util.Scanner;

public class Booking {

    int price;
    int time;

    boolean addToKvitto = false;
    String[] kvitto;
    Scanner myScanner = new Scanner(System.in);

    public Booking(){
        klippning();
        färgning();
        datum();
        kvitto();
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

    public void datum(){

    }

    public void kvitto(){
        System.out.println("Tack för din bokning! Här kommer ditt kvitto:");

        System.out.println("Det kommer kosta totalt " + price + "kr, och det kommer ta " + time /60 + " timmar och " + time %60 + " minuter");

    }

}
