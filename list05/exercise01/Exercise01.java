package exercise01;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] Strings) {

        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and heght:");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.println(rectangle);
        
        scanner.close();

    }
}
