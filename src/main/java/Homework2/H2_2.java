package Homework2;
import java.util.Scanner;

public class H2_2 {

    public static void main(String[] args) {
        /*SRB - Napraviti program gde cete uneti svoju radnu poziciju.
        Mozete uneti "fizikalac", "inzenjer" i "masinovodja" i uneti svoju platu.
        Ispisati u konzoli poziciju koju radis i platu.
        Ako ste na poziciji fizikalca, povecati platu za 15%.
        Ako ste na poziciji inzenjera, povecati platu za 20%.
        Ako ste na poziciji masinovodje, povecati platu za 30%.
        Ako je uneta pogresna informacija, potrebno je prijaviti to putem poruke.*/

        /*ENG - Create a program where you enter your job position.
        You can enter "laborer," "engineer," or "machine operator," and then enter your salary.
        Print your job position and salary in the console.
        If you are in the position of a laborer, increase your salary by 15%.
        If you are in the position of an engineer, increase your salary by 20%.
        If you are in the position of a machine operator, increase your salary by 30%.
        If incorrect information is entered, it should be reported through a message.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite Vase zanimanje");
        String zanimanje = sc.next();
        System.out.println("Unesite Vasu platu");
        double plata = sc.nextDouble();

        if (zanimanje.equalsIgnoreCase("fizikalac")) {
            System.out.println("Vasa pozicija je fizikalac sa platom " + plata);
            System.out.println("Vasa plata sa povisicom je: " + (plata * 1.15));
        }if (zanimanje.equalsIgnoreCase("inzenjer")) {
            System.out.println("Vasa pozicija je inzenjer sa platom " + plata);
            System.out.println("Vasa plata sa povisicom je " + (plata * 1.2));
        }if (zanimanje.equalsIgnoreCase("masinovodja")) {
            System.out.println("Vasa pozicija je masinovodja sa platom " + plata);
            System.out.println("Vasa plata sa povisicom je " + (plata * 1.3));
        } else { if(!zanimanje.equalsIgnoreCase("fizikalac") && (!zanimanje.equalsIgnoreCase("inzenjer")) && (!zanimanje.equalsIgnoreCase("masinovodja")))
            System.out.println("Uneli ste pogresnu poziciju");
        }

    }
}
