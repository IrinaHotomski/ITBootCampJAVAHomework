package Test1;
import java.util.Scanner;

public class T1_1 {

    public static void main(String[] args) {

        /*SRB - Napraviti program koji, koristeci DO WHILE petlju, racuna proizvod unetih brojeva
        sve dok korisnik ne unese 0. Na kraju ispisati koliki je proizvod samo ako je veci od 10*/

        /*ENG - Create a program that, using a DO WHILE loop, calculates the product of entered numbers
        until the user inputs 0. In the end, display the product only if it is greater than 10.*/

        Scanner sc = new Scanner(System.in);

        int proizvod = 1;
        int broj;

        do {
            System.out.println("Unesite neki broj");
            broj = sc.nextInt();
            if (broj!=0) {
                proizvod = proizvod * broj;
            }
        }while(broj!=0);

        if (proizvod>10){
            System.out.println("Proizvod unetih brojeva je " + proizvod);
        }

    }

}
