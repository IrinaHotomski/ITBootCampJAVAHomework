package Homework7;
import java.util.ArrayList;
import java.util.Scanner;

public class H7_2 {

    public static void main(String[] args) {

        /*SRB - Napraviti proizvoljnu listu imena, zatim uneti ime koje zelite da izbacite iz liste,
        ispisati poruku u zavisnosti od toga da li je izbaceno ili ne, i da li se uopste nalazi u listi.*/

        /*ENG - Create an arbitrary list of names, then enter the name you want to remove from the list.
        Print a message depending on whether it has been removed or not, and whether it exists in the list at all.*/

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Marko");
        lista.add("Irina");
        lista.add("Milica");
        lista.add("Aleksandar");

        Scanner sc = new Scanner(System.in);

        for (int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("------------");

        System.out.println("Unesite ime koje zelite da uklonite sa spiska");
        String ime = sc.next();

        if (lista.contains(ime)){
            System.out.println("Ime " + ime + " je obrisano");
            lista.remove(ime);
        } else {
            System.out.println("Ime koje ste uneli se ne nalazi na listi");
        }

        System.out.println("Nova lista je: ");

        for (int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }

    }
}
