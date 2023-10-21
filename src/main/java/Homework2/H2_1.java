package Homework2;

import java.util.Scanner;

public class H2_1 {

    public static void main(String[] args) {

        /*SRB - Napisati program gde unosite godinu koje ste krenuli da radite(npr 1998, 2001,..),
        zatim izracunavate godine radnog iskustva,
        ako imate manje od 4 ili 4 godine radnog iskustva,onda ste Junior programer
        (Napraviti ispis "Ti si Junior programer"),
        ako imate vise od 4 godine do 8 godina iskustva, onda ste senior programer
        ("Ti si Senior programer"), ako imate vise od 8 godina
        onda ste direktor firme("Vi ste direktor firme").*/

        /*ENG - Write a program where you enter the year you started working (e.g. 1998, 2001, ...),
        then calculate years of work experience.
        If you have less than 4 or exactly 4 years of work experience, you are a Junior programmer
        (Make the output: "You are a Junior programmer"),
        if you have more than 4 but less than or equal to 8 years of experience, you are a Senior programmer
        ("You are a Senior programmer"), and if you have more than 8 years of experience,
        you are the company's director ("You are the company's director").*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinju zaposlenja");
        int pocetak = sc.nextInt();
        System.out.println("Unesite trenutnu godinu");
        int godina = sc.nextInt();

        int z = godina - pocetak;
        if (z > 0) {
            if (z <= 4) {
                System.out.println("Vi ste junior");
            }
            if (z > 4 && z <= 8) {
                System.out.println("Vi ste senior");
            }
            if (z > 8 && z < 60) {
                System.out.println("Vi ste vlasnik");
            }
            if (z>60){
                System.out.println("U penziji ste");
            }

        }
    }
}
