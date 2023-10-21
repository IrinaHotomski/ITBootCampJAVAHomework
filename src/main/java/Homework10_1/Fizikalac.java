package Homework10_1;

public class Fizikalac extends Radnik{

    public Fizikalac(int ID, String imeRadnika, int godineIskustva, double plata) {
        super(ID, imeRadnika, godineIskustva, plata);
    }

    public void stampa(){
        System.out.println("Radnik:");
        System.out.println("ID " + this.ID);
        System.out.println("Ime " + this.imeRadnika);
        System.out.println("Godine iskustva " + this.godineIskustva);
        if (godineIskustva>5){
            plata = plata*1.2;
            System.out.println("Plata sa bonusom " + plata);
        }else {
            System.out.println("Plata " + plata);
        }
    }

}
