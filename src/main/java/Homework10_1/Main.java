package Homework10_1;

public class Main {
    public static void main(String[] args) {

        /*SRB - Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata.
        Klase Fizikalac, SefSmene i Investitor nasledjuju klasu Radnik.
        Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
        Istampati njihove podatke sa tim da racunamo 20% vecu platu sefu smene i fizikalcu ako
        imaju vise od 5 godina iskustva i 30% vecu platu investitoru ako je digao bar 5 zgrada.*/

        /*ENG - Create a class Worker with attributes id, worker's name, years of experience, and salary.
        The classes Laborer, ShiftManager, and Investor inherit from the Worker class.
        Investor will have an additional field for the number of buildings they have built.
        Print their information, taking into account a 20% higher salary for the Shift Manager and
        Laborer if they have more than 5 years of experience, and a 30% higher salary for the Investor
        if they have built at least 5 buildings.*/

        Radnik fizikalac = new Radnik(10,"ime",0,40000);
        Radnik sefSmene = new Radnik(30,"ime",0,50000);
        Radnik investitor = new Radnik(20,"ime",0,60000);

        Fizikalac f1 = new Fizikalac(fizikalac.ID, "Milos",4, fizikalac.plata);
        f1.stampa();
        Fizikalac f2 = new Fizikalac(fizikalac.ID, "Ivan", 6, fizikalac.plata);
        f2.stampa();

        Investitor i1 = new Investitor(investitor.ID, "Sara",2, investitor.plata, 4);
        i1.stampa();
        Investitor i2 = new Investitor(investitor.ID, "Bojan", 2, investitor.plata, 6);
        i2.stampa();

        SefSmene s1 = new SefSmene(sefSmene.ID, "Marija",4, sefSmene.plata);
        s1.stampa();
        SefSmene s2 = new SefSmene(sefSmene.ID, "Ivana", 6, sefSmene.plata);
        s2.stampa();
    }

}
