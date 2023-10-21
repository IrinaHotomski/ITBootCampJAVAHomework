package Homework6;
import java.util.Scanner;

public class H6_1 {

    public static void main(String[] args) {

        /*SRB - Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu,
        na kraju treba ispisati najveci broj od onih koje smo uneli.*/

        /*ENG - Enter the size of an array, then enter the numbers that will be in the array.
        Finally, it should print the largest number among those that we entered.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza");
        int broj = sc.nextInt();
        int niz[] = new int[broj];

        System.out.println("Unesite brojeve niza");

        for (int i=0; i< niz.length; i++){
            niz[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        System.out.println("Imamo niz: ");

        for (int i=0; i<niz.length; i++){
            if (niz[i]>max){
                max= niz[i];
            }
            System.out.println("Na " + (i+1) + ". mestu " + niz[i]);
        }

        System.out.println("Najveci broj niza je " + max);

    }
}
