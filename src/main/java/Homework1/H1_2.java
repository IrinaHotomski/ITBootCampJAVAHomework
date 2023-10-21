package Homework1;
import java.util.Scanner;

public class H1_2 {

    public static void main(String[] args) {

        /*SRB - Napraviti program gde cete uneti svoju godinu rodjenja,
        trenutnu godinu i u konzoli istampati svoj broj godina.*/

        /*ENG - Create a program where you will enter your year of birth,
        the current year, and print your age in the console.*/

        Scanner sc =new Scanner(System.in);

        System.out.println("Unesite svoju godinu rodjenja");
        int godinaRodjenja = sc.nextInt();

        System.out.println("Unesite trenutnu godinu");
        int godina = sc.nextInt();
        int z = godina - godinaRodjenja;

        System.out.println("Broj vasih godina je: " + z);

    }

}
