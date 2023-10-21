package Homework4;
import java.util.Scanner;

public class H4_1 {

    public static void main(String[] args) {

        //SRB - Napraviti program gde unosite neki broj i kao rezultat vracate njegov faktorijel.

        //ENG - Create a program where you enter a number, and as a result, it returns its factorial.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj");
        int x = sc.nextInt();
        int proizvod = 1;

        for (int i=1; i<x; i++){
            proizvod = proizvod * i;
        }

        System.out.println("Fakrotijel broja " + x + " je: " + proizvod);

    }
}
