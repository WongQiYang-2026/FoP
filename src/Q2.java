import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("The price of car:");
            double P = sc.nextDouble();
        System.out.print("Down payment:");
            double D = sc.nextDouble();
        System.out.print("Interest rate(%):");
            double R = sc.nextDouble();
        System.out.print("Loan duration(year):");
            double Y = sc.nextDouble();
        
            double M = (P-D)*(1+(R*Y)/100)/(Y*12);
            System.out.printf("Monthly payment:RM%.2f\n", M);
        
    
    
    }
}