package Homework5;
import java.util.Scanner;

public class H5_2 {

    public static void main(String[] args) {

        /*SRB - Napraviti program gde cete uneti broj nekih knjiga na lageru, zatim svaki put kada unesete '.'
        on ce skinuti po jednu knjigu sa lagera,
        tek nakon sto unesete neki drugi string ili ponestaje knjiga na lageru,
        izaci ce iz petlje i ispisati poruku, ukoliko je ponestajalo knjiga
        ispisati poruku da nema vise knjiga na lageru, ukoliko je unet neki drugi String,
        onda samo ispisati stanje knjiga na lageru.*/

        /*ENG - Create a program where you enter the number of books in stock. Then, each time you enter '.',
        it will reduce the stock by one book. It will exit the loop only after you enter a different string
        or when there are no more books in stock. If the books run out, it should print a message saying there
        are no more books in stock. If you enter a different string, it should just print the current state
        of books in stock.*/

        Scanner sc = new Scanner(System.in);
        String x;
        int brojKnjiga = 5;
        int i = 0;
        do {
            System.out.println("Unesite tacku");
            x = sc.next();
            i++;
        }while(x.equals(".") && i<brojKnjiga);

        if (!x.equals(".")){
            System.out.println("Broj knjiga na lageru je: " + (brojKnjiga-i));
        }
        if (i==brojKnjiga){
            System.out.println("Nema vise knjiga na lageru");
        }

    }
}
