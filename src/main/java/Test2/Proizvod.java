package Test2;

public class Proizvod {

    String naziv;
    double cena;
    double kolicina;
    boolean popust;

    public Proizvod(String naziv, double cena, double kolicina, boolean popust) {
        this.naziv = naziv;
        this.cena = cena;
        this.kolicina = kolicina;
        this.popust = popust;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public boolean isPopust() {
        return popust;
    }

    public void setPopust(boolean popust) {
        this.popust = popust;
    }

}
