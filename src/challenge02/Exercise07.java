package challenge02;

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        float x, y;
        x = scan.nextFloat();
        y = scan.nextFloat();

        if((x > 0) && (y > 0)) {

            System.out.println("Q1");

        } else if((x < 0) && (y > 0)) {

            System.out.println("Q2");

        } else if((x < 0) && (y < 0)) {

            System.out.println("Q3");

        } else if((x > 0) && (y < 0)) {

            System.out.println("Q4");

        } else {

            System.out.println("Origem");

        }


    }
}
