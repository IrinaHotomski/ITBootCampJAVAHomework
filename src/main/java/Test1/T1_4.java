package Test1;
import java.util.Scanner;

public class T1_4 {

    public static void main(String[] args) {

        /*SRB - Napraviti program koji racuna koliko puta se neki broj pojavljuje u nizu. Korisnik preko
        skenera unosi koji broj zeli da prebroji u nizu.*/

        /*ENG - Create a program that counts how many times a specific number appears in an array.
        The user enters the number they want to count in the array using a scanner.*/

        Scanner sc = new Scanner(System.in);

        int niz []={1,2,1,2,1,5,6,1};

        System.out.println("Niz je:");
        for (int i=0; i< niz.length; i++){
            System.out.print(niz[i]);
        }

        System.out.println("Unesite broj");
        int broj = sc.nextInt();
        int brojac = 0;

        for (int i=0; i< niz.length; i++){
            if (niz[i] == broj){
                brojac = brojac + 1;
            }
        }

        System.out.println("U nizu se broj " + broj + " pojavljuje " + brojac + " puta");

    }

}
