package Homework11;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*SRB - Napraviti klasu "Namirnica". Ona ima atribute za naziv i cenu.
        Dodati konstuktor i get metode za ovu klasu. Zatim napraviti klasu "Korpa".
        Unutar korpe imamo listu namirnica. Osim konstuktora definisati:
        - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
        - metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
        - metoda stampaj() - istampace sve namirnice iz liste.
        U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.*/

        /*ENG - Create a class "Namirnica"". It has attributes for the name and price.
        Add a constructor and get methods for this class. Then create a class "Korpa".
        Inside the cart, we have a list of grocery items. In addition to the constructor, define the following:
        - a method int sum(ArrayList<Namirnica> list) - returns the total price of all grocery items in the cart.
        - a method boolean contains(Namrnica n) - returns true if a grocery item is in the cart.
        - a method print() - prints all grocery items from the list.
        In the main class, create a list of grocery items that you will pass to the constructor of the "Korpa" class.*/

        ArrayList<Namirnica> lista = new ArrayList<>();
        Namirnica n1 = new Namirnica("Jabuka",200);
        Namirnica n2 = new Namirnica("Cokolada",100);
        Namirnica n3 = new Namirnica("Mleko",150);

        lista.add(n1);
        lista.add(n2);
        lista.add(n3);

        Korpa k1 = new Korpa(lista);
        k1.stampaj();

        Namirnica n4 = new Namirnica("Jabuka", 200);

        System.out.println("Da li se namirnica " + n4.getNaziv() + " nalazi u korpi? " + k1.nalaziSe(n4));
        System.out.println("Suma proizvoda u korpi je: " + k1.sum(lista));
    }

}
