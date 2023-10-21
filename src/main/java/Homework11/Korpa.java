package Homework11;
import java.util.ArrayList;

public class Korpa {

    ArrayList<Namirnica> listaNamirnica;

    public Korpa(ArrayList<Namirnica> listaNamirnica) {
        this.listaNamirnica = listaNamirnica;
    }

    public int sum(ArrayList<Namirnica> lista) {
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getCena();
        }
        return suma;
    }

    public boolean nalaziSe(Namirnica n) {
        boolean provera = false;
        for (int i = 0; i < listaNamirnica.size(); i++) {
            if (listaNamirnica.get(i)==(n)) {
                provera = true;
                break;
            }
        }
        return provera;
    }

    public void stampaj() {
        for (int i = 0; i < listaNamirnica.size(); i++) {
            System.out.println("Namirnica " + listaNamirnica.get(i).getNaziv()+" ima cenu "+listaNamirnica.get(i).getCena());
        }
    }

}
