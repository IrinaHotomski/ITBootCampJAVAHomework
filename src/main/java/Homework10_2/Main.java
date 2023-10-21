package Homework10_2;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*SRB - Napraviti klasu "Jelo", koje ce imati atribute za naziv, listu sastojaka
        i boolean vrednost bezLaktoze. Klase "Corba", "Torta" i "Sarma" nasledjuju klasu Jelo.
        Ukoliko je jedan od sastojaka mleko, podesicemo boolean vrednost za laktozu na false,
        u suprotnom na true. U main klasi kreirati i istampati bar tri jela
        (njihov naziv, sastojke i da li lactose-free).*/

        /*ENG - Create a class "Jelo", which will have attributes for the name, a list of ingredients,
        and a boolean value for lactose-free. The classes "Supa", "Torta", and "Satma" inherit
        from the "Jelo" class. If one of the ingredients is milk, we will set the lactose boolean value to false;
        otherwise, it will be set to true. In the main class, create and print at least three dishes
        (their name, ingredients, and whether they are lactose-free).*/

        ArrayList<String> lista = new ArrayList<>();

        Torta t1 = new Torta("Coko keks",lista,true);
        t1.listaSastojaka.add("Cokolada");
        t1.listaSastojaka.add("Mleko");
        t1.listaSastojaka.add("Keks");
        t1.listaSastojaka.add("Banane");
        t1.stampa();
        t1.brisanje();

        Sarma s1 = new Sarma("Sarma", lista, true);
        s1.listaSastojaka.add("Kupus");
        s1.listaSastojaka.add("Meso");
        s1.listaSastojaka.add("Biber");
        s1.stampa();
        s1.brisanje();


        Corba c1 = new Corba("Riblja",lista,true);
        c1.listaSastojaka.add("Riba");
        c1.listaSastojaka.add("Povrce");
        c1.listaSastojaka.add("Voda");
        c1.stampa();
    }

}
