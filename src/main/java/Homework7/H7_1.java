package Homework7;
import java.util.ArrayList;

public class H7_1 {

    public static void main(String[] args) {

        /*SRB - Napraviti proizvoljan niz brojeva, podeliti ih u dve liste,
        jedna lista ce u sebi sadrzati sve parne brojeve dok ce druga lista zadrzati sve neparne brojeve.*/

        /*ENG - Create an arbitrary array of numbers, split them into two lists. One list will contain all even numbers,
        while the other list will retain all odd numbers.*/

        System.out.println("Imam niz: ");
        int niz[] = {1,-8,26,52,33,2,7};
        for (int i=0; i< niz.length; i++){
            System.out.println(niz[i]);
        }

        ArrayList lista1 = new ArrayList<>();
        ArrayList lista2 = new ArrayList<>();

        System.out.println("Parni brojevi su: ");
        int b = 0;
        for (int i=0; i<niz.length; i++){
            if (niz[i]%2==0){
                lista1.add(niz[i]);
                System.out.println(lista1.get(b));
                b= b+1;
            }

        }

        System.out.println("Neparni brojevi su: ");

        int c =0;
        for (int i=0; i< niz.length; i++){
            if (niz[i]%2==1){
                lista2.add(niz[i]);
                System.out.println(lista2.get(c));
                c= c+1;
            }
        }

    }
}
