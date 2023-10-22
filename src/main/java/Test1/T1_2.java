package Test1;
import java.util.ArrayList;

public class T1_2 {

    public static void main(String[] args) {

        /*SRB - Napraviti program koji nalazi najveci broj u listi i vraca informaciju
        da li je taj najveci broj paran*/

        /*ENG - Create a program that finds the largest number in a list and returns
        information about whether that largest number is even.*/

        ArrayList <Integer> lista = new ArrayList<>();

        lista.add(3);
        lista.add(6);
        lista.add(-12);
        lista.add(0);
        lista.add(15);
        lista.add(2);

        System.out.println(lista);

        int max = Integer.MIN_VALUE;

        for (int i=0; i< lista.size(); i++){
            if (lista.get(i) > max){
                max = lista.get(i);
            }
        }

        System.out.println("Najveci broj u listi je: " + max);
        if (max%2==0){
            System.out.println("On je paran");
        }else {
            System.out.println("On nije paran");
        }

    }

}
