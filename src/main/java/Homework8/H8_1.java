package Homework8;

public class H8_1 {

    public static void main(String[] args) {

        /*SRB - Napraviti proizvoljan niz imena, zatim napraviti metod koji ce kao parametre
        primati niz imena i String koji zelimo da proverimo, ispisati poruku ukoliko
        se ime nalazi u nizu, obavestiti ako nije tu. (Ime za proveru vi unosite)*/

        /*ENG - Create an arbitrary array of names, then create a method that takes an array of names
        and a string we want to check as parameters. Print a message if the name is in the array
        and notify if it's not there. (You input the name to be checked.)*/

        String niz [] = {"Milica", "Marko", "Sara", "Marija", "Jovan"};
        String ime = "Irina";
        if (metoda(niz, ime)){
            System.out.println("Ime " + ime + " se nalazi u nizu");
        } else {
            System.out.println("Ime " + ime + " se ne nalazi u nizu");
        }

    }
    public static boolean metoda (String [] niz1, String a){
        boolean provera = false;
        for (int i=0; i< niz1.length; i++){
            if (niz1[i].equals(a)){
                provera = true;
                break;
            }
        }
        return provera;
    }
}
