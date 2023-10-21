package Homework8;
import java.util.ArrayList;
import java.util.Scanner;

public class H8_2 {

    public static void main(String[] args) {

        /*SRB - Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0.
        Zatim cete uneti neki broj, pomocu metode napraviti novu listu koja ce
        u sebi sadrzati sve brojeve vece od unetog broja. Novu listu pozvati pomocu metode
        za stampanje elemenata liste.*/

        /*ENG - Create a list of numbers using a scanner until 0 is entered. Then, you will enter a number.
        Using a method, create a new list that contains all numbers greater than the entered number.
        Call the method to print the elements of the new list.*/

        Scanner sc = new Scanner(System.in);
        ArrayList lista= new ArrayList<>();

        System.out.println("Unesite broj za listu");
        int broj = sc.nextInt();
        lista.add(broj);
        while(broj!=0){
            broj = sc.nextInt();
            lista.add(broj);
        }
        //Stampam radi provere
        System.out.println(lista);
        System.out.println("Unesite neki broj");
        int broj2 = sc.nextInt();

        System.out.println("Svi brojevi veci do " + broj2 + " su: ");
        stampanje(metoda(lista, broj2));

    }

    public static ArrayList<Integer> metoda (ArrayList <Integer> lista1, int a){
        ArrayList <Integer> lista2 = new ArrayList<>();
        for (int i=0; i< lista1.size(); i++){
            if (lista1.get(i)>a){
                lista2.add(lista1.get(i));
            }
        }
        return lista2;
    }

    public static void stampanje (ArrayList<Integer> lista1){
        for (int i=0; i< lista1.size(); i++){
            System.out.println(lista1.get(i));
        }
    }
}
