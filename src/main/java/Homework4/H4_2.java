package Homework4;
import java.util.Scanner;

public class H4_2 {

    public static void main(String[] args) {

        /*SRB - Napraviti program gde unosite svoju godinu rodjenja i
        ispisati broj prestupnih godina od vaseg rodjenja do tekuce godine.*/

        /*ENG - Create a program where you enter your year of birth and
        display the number of leap years from your birth year to the current year.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu svog rodjenja");
        int rodjendan = sc.nextInt();
        int sum = 0;

        for (int i=rodjendan; i<2022; i++){
            if (i%4==0){
                sum = sum + 1;
            }
        }

        System.out.println("Broj pestupnih godina od Vaseg rodjenja do danas je: " + sum);

    }
}
