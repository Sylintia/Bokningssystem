import java.util.Scanner;

public class Bokning {

    int pris = 0;

    Scanner myScanner = new Scanner(System.in);

    public Bokning(){
        klippning();
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
            }

            if (frisyr == 2){
                pris += 200;
            }
        } else ...
    }

}
