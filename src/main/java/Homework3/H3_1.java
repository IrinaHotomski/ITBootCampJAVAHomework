package Homework3;
import java.util.Scanner;

public class H3_1 {

    public static void main(String[] args) {

        /*SRB - Napisati program gde cete uneti velicinu majice: 24( Ispise: S velicina), 30cm(Ispise: M Velicina),
        36cm (ispise: L velicina), 42cm(ispise: XL velicina) u suprotnom izbaciti gresku o nepostojecoj velicini.*/

        /*ENG - Write a program where you enter the size of a t-shirt: 24 (Outputs: Size S), 30cm (Outputs: Size M),
        36cm (Outputs: Size L), 42cm (Outputs: Size XL). Otherwise, display an error for a non-existent size.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj majice koji nosite");
        int x = sc.nextInt();

        switch (x) {
            case 24:
                System.out.println("S velicina");
                break;
            case 30:
                System.out.println("M velicina");
                break;
            case 36:
                System.out.println("Lvelicina");
                break;
            case 42:
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("Greska");
                break;
        }

    }
}
