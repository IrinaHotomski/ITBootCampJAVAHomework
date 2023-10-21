package Homework9;

public class H9_1_MainClass {

    public static void main(String[] args) {

        /*SRB - Napraviti klasu "Knjiga" koja ce imati naziv i zanr.
        U glavnoj klasi napraviti dve knjige, zatim proveriti da li imaju isti zanr i naziv,
        ako imaju, ispisati poruku da je u pitanju ista knjiga, ako je samo zanr isti,
        ispisati poruku koji je to zanr, ako nista od toga nije isto, ispisati poruku
        da su u pitanju dve razlicite knjige.*/

        /*ENG - Create a class "Knjiga" that will have a title and a genre. In the main class, create two books,
        then check if they have the same genre and title. If they have the same title and genre,
        print a message that it's the same book. If only the genre is the same, print a message specifying
        the matching genre. If none of these are the same, print a message that they are two different books.*/

        Knjiga knjiga1 = new Knjiga();
        knjiga1.naziv = "Crvenkapa";
        knjiga1.zanr = "Bajka";

        Knjiga knjiga2 = new Knjiga();
        knjiga2.naziv = "Bela Griva";
        knjiga2.zanr = "Tragedija";

        System.out.println("Knjiga " + knjiga1.naziv + " je " + knjiga1.zanr);
        System.out.println("Knjiga " + knjiga2.naziv + " je " + knjiga2.zanr);

        if (knjiga1.naziv==knjiga2.naziv && knjiga1.zanr==knjiga2.zanr){
            System.out.println("Ista knjiga");
        } else if (knjiga1.naziv!=knjiga2.naziv && knjiga1.zanr==knjiga2.zanr) {
            System.out.println("Knjige imaju isti zanr");
        } else if (knjiga1.naziv!=knjiga2.naziv && knjiga1.zanr!=knjiga2.zanr) {
            System.out.println("Ovo su dve razlicite knjige");
        }

    }
}
