package Homework5;
import java.util.Scanner;

public class H5_1 {

    public static void main(String[] args) {

        /*SRB - Napraviti program gde cete uneti neki broj i kao rezultat vratiti
        zbir svih njegovih prethodnih brojeva. (napraviti sa for i while primere)*/

        /*ENG - Create a program where you enter a number, and as a result,
        return the sum of all its preceding numbers. (Provide examples using both 'for' and 'while' loops.)*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki pozitivan broj");
        int broj = sc.nextInt();
        int sum = 0;
        int sum2 = 0;

        if (broj>0) {
            for (int i = 0; i < broj; i++) {
                sum = sum + i;
            }
            System.out.println("(For) Zbir svih prethodnih brojeva je: " + sum);

            int i2 = 0;
            while (i2 < broj) {
                sum2 = sum2 + i2;
                i2++;
            }
            System.out.println("(While) Zbir svih prethodnih brojeva je: " + sum2);
        } else {
            System.out.println("Greska");
        }

    }
}
