package Homework6;
import java.util.Scanner;

public class H6_3 {

    public static void main(String[] args) {

        /*SRB - Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj,
        i u novom nizu smestiti sve brojeve koji su veci od tog unetog broja
        (Obratiti paznju da nov niz nema prazna polja tj 0).*/

        /*ENG - Create an arbitrary array of numbers, then enter a number via a Scanner.
        In a new array, store all numbers that are greater than the entered number
        (Ensure that the new array does not have empty fields, i.e., 0).*/

        Scanner sc = new Scanner(System.in);

        int niz[] = {1,2,3,4,5};
        System.out.println("Unesite neki broj");
        int broj = sc.nextInt();
        int sum = 0;

        System.out.println("Niz 1 je: ");

        for (int i=0; i< niz.length; i++){
            System.out.println(niz[i]);
            if (niz[i]>broj){
                sum = sum +1;
            }
        }

        System.out.println("Niz2 je: ");

        int niz2[] = new int [sum];
        int b = 0;

        for (int i=0; i<niz.length; i++){
            if (niz[i]>broj){
                niz2[b] = niz[i];
                System.out.println(niz2[b]);
                b = b +1;
            }
        }

    }
}
