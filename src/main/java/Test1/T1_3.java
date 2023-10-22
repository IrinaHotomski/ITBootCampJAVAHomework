package Test1;

public class T1_3 {

    public static void main(String[] args) {

        /*SRB - Kreirati dva niza brojeva. Proveriti da li je suma parnih brojeva veca
        od sume neparnih brojeva u odnosu na drugi niz*/

        /*ENG - Create two arrays of numbers. Check if the sum of even numbers is
        greater than the sum of odd numbers in comparison to the other array.*/

        int niz1 []={2,5,12,9};
        int niz2 [] = {1,6,13,3};

        System.out.println("Niz1 je");

        for (int i=0; i< niz1.length; i++){
            System.out.println(niz1[i]);
        }

        System.out.println("Niz2 je");

        for (int i=0; i< niz2.length; i++){
            System.out.println(niz2[i]);
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i=0; i< niz1.length; i++){
            if (niz1[i]%2==0){
                sum1= sum1 + niz1[i];
            }
        }

        System.out.println("Suma parnih brojeva prvog niza je " + sum1);

        for (int i=0; i< niz2.length; i++){
            if (niz2[i]%2==1){
                sum2 = sum2 + niz2[i];
            }
        }

        System.out.println("Suma neparnih brojeva drugog niza je " + sum2);

        if (sum1>sum2){
            System.out.println("Suma parnih brojeva prvog niza je veca od sume neparnih brojeva drugog niza");
        }else if (sum1<sum2) {
            System.out.println("Suma parnih brojeva prvog niza nije veca od sume neparnih brojeva drugog niza");
        } else if (sum1==sum2) {
            System.out.println("Suma parnih brojeva prvog niza je jednaka sumi neparnih brojeva drugog niza");
        }

    }

}
