package Homework5;
import java.util.Scanner;

public class H5_3 {

    public static void main(String[] args) {

        /*SRB - Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din,
        kruske 100 din i banane 140 din, tako da se suma
        racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo),
        toliko dodajemo na sumu, kada se unese ".",
        program izlazi iz petlje i pise ukupnu cenu navedenog voca.*/

        /*ENG - Create a program for a fruit basket, calculate the total price.
        Assuming that apples cost 50 din, pears 100 din, and bananas 140 din, so the sum is calculated
        as long as you enter "apple," "banana," or "pear" (depending on which string you enter).
        You add the corresponding price to the sum. When you enter ".", the program exits the loop
        and prints the total price of the listed fruits.*/

        Scanner sc = new Scanner(System.in);
        int kruske = 100;
        int banane = 140;
        int jabuke = 50;
        System.out.println("Unesite prvo voce");
        String voce = sc.next();
        int sum = 0;
        switch (voce) {
            case "jabuke":
                sum = sum + jabuke;
                break;
            case "kruske":
                sum = sum + kruske;
                break;
            case "banane":
                sum = sum + banane;
                break;
            default:
                System.out.println("Voce koje ste uneli ne postoji");
                break;
        }

        while (voce.equals("jabuke") || voce.equals("kruske") || voce.equals("banane")) {
            System.out.println("Unesite sledece voce ili tacku");
            voce = sc.next();
            switch (voce) {
                case "jabuke":
                    sum = sum + jabuke;
                    break;
                case "kruske":
                    sum = sum + kruske;
                    break;
                case "banane":
                    sum = sum + banane;
                    break;
                case ".":
                    System.out.println("Cena Vase korpe je: " + sum + "din");
                    break;
                default:
                    System.out.println("Voce koje ste uneli ne postoji");
                    break;
            }
        }

    }
}
