package Homework9;

public class H9_2_MainClass {

    public static void main(String[] args) {

        /*SRB - Napraviti klasu "Radnik" koja ima ime, poziciju i platu.
        U glavnoj klasi napraviti dva radnika, proveriti cija je plata veca,
        istampati informacije radnika cija je plata veca, uz 20% vecu platu.*/

        /*ENG - Create a class "Radnik" that has a name, position, and salary. In the main class,
        create two workers, check whose salary is higher, print the information of the worker with
        the higher salary, with a 20% higher salary.*/

        Radnik radnik1 = new Radnik("Ivan", "Krojac", 40000);
        Radnik radnik2 = new Radnik("Ivana", "Menadzer",60000);

        if (radnik1.plata>radnik2.plata){
            radnik1.stampa();
        }else if(radnik1.plata< radnik2.plata){
            radnik2.stampa();
        }else if (radnik1.plata== radnik2.plata){
            System.out.println("Imaju istu platu");
        }

    }
}
