package Homework10_2;
import java.util.ArrayList;

public class Corba extends Jelo{
    public Corba(String naziv, ArrayList<String> listaSastojaka, boolean bezLaktoze) {
        super(naziv, listaSastojaka, bezLaktoze);
    }

    public void stampa(){
        System.out.println("Od sastojaka za corbu " + naziv + " potrebno nam je");
        for (int i=0; i<listaSastojaka.size(); i++){
            System.out.println(listaSastojaka.get(i));
        }
        for (int i=0; i<listaSastojaka.size(); i++){
            if (listaSastojaka.get(i).equals("Melko")){
                bezLaktoze = false;
                break;
            }
        }
        if (bezLaktoze){
            System.out.println("Ovo jelo ne sadrzi laktozu");
        }else {
            System.out.println("Ovo jelo sadrzi laktozu");
        }
    }

    public ArrayList <String> brisanje(){
        for (int i=listaSastojaka.size()-1; i>=0; i--){
            listaSastojaka.remove(i);
        }
        return listaSastojaka;
    }

}
