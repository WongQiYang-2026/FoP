
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        double Fahrenheit, Celcius;
        System.out.print("Enter degree Fahrenheit:");
        Scanner scanner = new Scanner (System.in);
        Fahrenheit = scanner.nextDouble();
        Celcius = (Fahrenheit-32)/1.8 ;
        System.out.printf("Celcius=%.2f degree Celcius\n", Celcius);
    }
    
}
