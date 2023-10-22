package Test1;
import java.util.Scanner;

public class T1_5 {

    public static void main(String[] args) {

        /*SRB - Napisati program koji racuna potrosnju goriva. Korisnik unosi distancu, tip vozila i tip goriva,
        a program ispisuje koliko ce goriva biti potroseno i koja je ukupna cena. Motor trosi 5 litara na 100 km.
        Automobil trosi 9 litara na 100 km. Kamion trosi 15 litara na 100 km. Tipovi goriva su:
        Benzin kosta 195 dinara po litru. Dizel kosta 220 dinara po litru.
        Zadatak raditi kroz switch i pokriti samo happy flow uz default*/

        /*ENG - Write a program that calculates fuel consumption. The user inputs the distance, type of vehicle,
        and fuel type, and the program displays how much fuel will be consumed and the total cost.
        A motorcycle consumes 5 liters per 100 km, a car consumes 9 liters per 100 km,
        and a truck consumes 15 liters per 100 km. The types of fuel are as follows:
        Petrol costs 195 dinars per liter, and Diesel costs 220 dinars per liter.
        Handle the task using a switch statement and cover only the happy flow with a default case.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite distancu");
        double distanca = sc.nextInt();
        System.out.println("Unesite tip vozila");
        String tipVozila = sc.next();
        System.out.println("Uneite tip goriva");
        String tipGoriva = sc.next();

        switch (tipVozila){
            case ("Motor"):
                if(tipGoriva.equals("Dizel")){
                    double racun1 = 0.05 * distanca * 220;
                    System.out.println("Cena Dizela za " + distanca+ " km je " + racun1 + "din");
                }else {
                    double racun1 = 0.05 * distanca * 195;
                    System.out.println("Cena benzina za " + distanca + " km je " + racun1 + "din");
                }
                break;
            case ("Automobil"):
                if(tipGoriva.equals("Dizel")){
                    double racun1 = 0.09 * distanca * 220;
                    System.out.println("Cena Dizela za " + distanca+ " km je " + racun1 + "din");
                }else {
                    double racun1 = 0.09 * distanca * 195;
                    System.out.println("Cena benzina za " + distanca + " km je " + racun1 + "din");
                }
                break;
            case ("Kamion"):
                if(tipGoriva.equals("Dizel")){
                    double racun1 = 0.15 * distanca * 220;
                    System.out.println("Cena Dizela za " + distanca+ " km je " + racun1 + "din");
                }else {
                    double racun1 = 0.15 * distanca * 195;
                    System.out.println("Cena benzina za " + distanca + " km je " + racun1 + "din");
                }
                break;
            default:
                System.out.println("Greska");
        }

    }

}
