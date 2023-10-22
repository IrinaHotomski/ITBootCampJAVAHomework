package Test2;

public class T2 {
    public static void main(String[] args) {

        /*SRB - Potrebno je kreirati klasu "Proizvod" koja ce imati sve private atribute sa punim
        konstruktorom(naziv, cena, kolicina, popust). Napraviti klasu "Korpa" koja ce da nasledi klasu "Proizvod"
        i sve njene atribute. U klasi "Korpa" izracunati finalnu cenu proizvoda i odstampati.
        Ako je proizvod na popustu onda cenu umanjiti za 20%. Ako je kolicina proizvoda veca od 4
        onda cenu umanjiti za 50% nezavisno da li je na popustu ili ne.*/

        /*ENG - You need to create a class called "Proizvod" that has all private attributes with a full
        constructor (name, price, quantity, discount). Create a class "Korpa" that inherits from the "Proizvod"
        class and inherits all its attributes. In the "Korpa" class, calculate the final product price
        and print it. If the product is on sale, reduce the price by 20%. If the quantity of the product
        is greater than 4, then reduce the price by 50%, regardless of whether it's on sale or not.*/

        Proizvod p1 = new Proizvod("Jabuka",100,5,true);
        Proizvod p2 = new Proizvod("Kruska",100,5,false);

        Korpa k1 = new Korpa(p1.naziv, p1.cena, p1.kolicina, p1.popust);
        Korpa k2 = new Korpa(p2.naziv, p2.cena, p2.kolicina, p2.popust);
        Korpa k3 = new Korpa("Pomorandza",100,3,true);
        Korpa k4 = new Korpa("Breskva",100,3,false);

        k1.stampa();
        k2.stampa();
        k3.stampa();
        k4.stampa();
    }

}
