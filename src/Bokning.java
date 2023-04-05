import java.util.Scanner;

public class Bokning {

    int pris;
    int tid;
    String kvitto;

    Scanner myScanner = new Scanner(System.in);

    public Bokning(){
        klippning();
        färgning();
        datum();
        //kvitto(); //länka till denhär i slutet av datum istället
    }


    //Frågar om kunden vill klippa håret och ger olika förslag på klippningar
    public void klippning(){
        System.out.println("Vill du klippa dig? (1: Ja, 2: Nej)");
        int klippning = myScanner.nextInt();

        if (klippning == 1){
            pris += 200;
            System.out.println("Vill du klippa en ny frisyr, eller bara topparna? (1: ny frisyr, 2: topparna)");
            int frisyr = myScanner.nextInt();

            if (frisyr == 1){
                pris += 400;
                tid += 30;
                kvitto += "Klippning: ny frisyr (+600kr)";
            } else if (frisyr == 2){
                pris += 200;
                tid += 20;
                kvitto += "Klippning: topparna (+400kr)";
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
                pris += 1000;
                tid += 120;
                kvitto += "Färgning: naturlig färg (+1000kr)";
            } else if (färg == 2){
                pris += 2000;
                tid += 120;
                kvitto += "Färgning: onaturlig färg (+2000kr)";
            }
        } else if (färgning == 2){
            datum();
        }
    }

    public void datum(){

    }

    public void kvitto(){
        System.out.println("Tack för din bokning! Här kommer ditt kvitto:");

        if(){

        }
    }

}
