import java.util.ArrayList;
import java.util.Scanner;

public class Bokning {

    int pris;
    int tid;

    boolean addToKvitto = false;
    String[] kvitto;
    Scanner myScanner = new Scanner(System.in);

    public Bokning(){
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
            pris += 200;
            System.out.println("Vill du klippa en ny frisyr, eller bara topparna? (1: ny frisyr, 2: topparna)");
            int frisyr = myScanner.nextInt();

            if (frisyr == 1){
                pris += 400;
                tid += 30;

            } else if (frisyr == 2){
                pris += 200;
                tid += 20;
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
            } else if (färg == 2){
                pris += 2000;
                tid += 120;
            }
        } else if (färgning == 2){
            datum();
        }
    }

    public void datum(){

    }

    public void kvitto(){
        System.out.println("Tack för din bokning! Här kommer ditt kvitto:");

        System.out.println("Det kommer kosta totalt " + pris + "kr, och det kommer ta " + tid/60 + " timmar och " + tid%60 + " minuter");

    }

}
