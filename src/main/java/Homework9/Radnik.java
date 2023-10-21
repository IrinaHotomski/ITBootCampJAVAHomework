package Homework9;

public class Radnik {

    String ime;
    String pozicija;
    int plata;

    public Radnik(String ime, String pozicija, int plata) {
        this.ime = ime;
        this.pozicija = pozicija;
        this.plata = plata;
    }

    public void stampa (){
        System.out.println("Radnik " + this.ime + " je na poziciji " + this.pozicija + " sa platom " + this.plata*1.2);
    }

}
