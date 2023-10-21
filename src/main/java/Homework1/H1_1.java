package Homework1;

public class H1_1 {

        public static void main(String[] args) {

       /*SRB - Napraviti program gde cete uneti informacije o nekom vocu tako sto cete kreirati
         String za naziv nekog voca i double vrednost za njegovu cenu.
         Uneti 4 naziva i 4 cene za odredjeno voce, i u svakom redu posebno stampati naziv vocke
         i njenu cenu za 30% snizenu.*/

       /*ENG -Create a program where you will enter information about a fruit by creating a
         String for the fruit's name and a double value for its price.
         Enter 4 names and 4 prices for specific fruits, and in each line, print the name of the fruit
         and its price reduced by 30% separately.*/

            String voce1 = "Jabuka";
            String voce2 = "Kruska";
            String voce3 = "Mandarine";
            String voce4 = "Banane";
            double cena1 = 49;
            double cena2 = 95;
            double cena3 = 112;
            double cena4 = 200;

            System.out.println("Cena za artikal " + voce1 + " je " + cena1*0.7);
            System.out.println("Cena za artikal " + voce2 + " je " + cena2*0.7);
            System.out.println("Cena za artikal " + voce3 + " je " + cena3*0.7);
            System.out.println("Cena za artikal " + voce4 + " je " + cena4*0.7);

        }

}
