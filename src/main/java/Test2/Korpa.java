package Test2;

public class Korpa extends Proizvod{

    public Korpa(String naziv, double cena, double kolicina, boolean popust) {
        super(naziv, cena, kolicina, popust);
    }

    public double finalnaCena (){
        double cena = getCena();
        if (getKolicina()>4){
            cena = getCena()*0.5;
        } else if (popust){
            cena = getCena()*0.8;
        }
        return cena;
    }

    public void stampa (){
        System.out.println("Proizvod " + this.naziv);
        System.out.println("Cena " + this.cena + "din");
        System.out.println("Kolicina " + this.kolicina + "kg");
        if (kolicina>4){
            System.out.println("Popust na kolicinu");
        }else if (popust){
            System.out.println("Na popustu je");
        }else {
            System.out.println("Nije na popustu");
        }
        System.out.println("Kosta " + finalnaCena() + "din");
    }

}
