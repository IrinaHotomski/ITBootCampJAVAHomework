package Homework10_1;

public class Investitor extends Radnik{

    int brojZgrada;

    public Investitor(int ID, String imeRadnika, int godineIskustva, double plata, int brojZgrada) {
        super(ID, imeRadnika, godineIskustva, plata);
        this.brojZgrada = brojZgrada;
    }

    public void stampa() {
        System.out.println("Investitor: ");
        System.out.println("ID " + this.ID);
        System.out.println("Ime " + this.imeRadnika);
        System.out.println("Godine iskustva " + this.godineIskustva);
        System.out.println("Broj zgrada koje je podigao " + this.brojZgrada + " zgrade");
        if (brojZgrada > 5) {
            plata = plata * 1.3;
            System.out.println("Plata sa bonusom " + plata);
        } else {
            System.out.println("Plata " + plata);
        }
    }

}
