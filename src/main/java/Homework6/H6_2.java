package Homework6;

public class H6_2 {

    public static void main(String[] args) {

        //SRB - Napraviti niz brojeva, gde cete svaki neparan broj povecati za 2.

        //ENG - Create an array of numbers, where you will increase each odd number by 2.

        int niz[] = {1,6,8,2,5,9,15};

        for (int i=0; i< niz.length; i++){
            System.out.println((i+1) + ". clan je " + niz[i]);
        }

        System.out.println("-------------");

        for (int i=0; i< niz.length; i++){
            if (niz[i]%2==1){
                niz[i] = niz[i]+2;
            }
            System.out.println((i+1) + ". clan je " + niz[i]);
        }





    }
}
