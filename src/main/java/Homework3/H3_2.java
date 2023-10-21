package Homework3;
import java.util.Scanner;

public class H3_2 {

    public static void main(String[] args) {

        /*SRB - Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi) nakon toga,
        uneti neku godinu izdanja knjige, ukoliko su Triler i Romantika
        starija od 30 godina, onda treba ispisati poruku da zanr knjige vise nije na lageru,
        takodje ako je Horor stariji od 40 godina i ako je Krimi starije od 20 godina,
        ukoliko zanr nije stariji od ogranicenja, ispisati poruku da je zanr knjige na lageru.*/

        /*ENG - Write a program where you enter the genre of a book (Romance, Thriller, Horror, Crime). After that,
        enter the publication year of the book. If it's a Thriller or Romance book and it's older than 30 years,
        then display a message that the genre of the book is no longer in stock.
        Also, if it's a Horror book and it's older than 40 years, or if it's a Crime book and it's older than 20
        years, then display a message that the genre of the book is no longer in stock.
        If the genre is not older than the specified limits, display a message that the genre of the book
        is in stock.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite zanr knjige");
        String zanr = sc.next().toLowerCase();
        System.out.println("Unesite izdanje");
        int x = sc.nextInt();

        switch (zanr) {
            case "romantika": {
                if ((2022 - x) > 30) {
                    System.out.println("Nema na lageru");
                } else {
                    System.out.println("Ima na lageru");}
                break;
            }
            case "triler": {
                if ((2022 - x) > 30) {
                    System.out.println("Nema na lageru");
                }else {
                    System.out.println("Ima na lageru");}
                break;
            }
            case "horor": {
                if ((2022 - x) > 40) {
                    System.out.println("Nema na lageru");
                }else {
                    System.out.println("Ima na lageru");}
                break;
            }
            case "krimi": {
                if ((2022 - x) > 20) {
                    System.out.println("Nema na lageru");
                }else {
                    System.out.println("Ima na lageru");}
                break;
            }
            default: {
                System.out.println("Uneli ste pogresan zanr");
                break;
            }

        }
    }
}
