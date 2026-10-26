import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water(g):");
        double M = (sc.nextDouble())/1000;
        System.out.print("Initial Temperature in Fahrenheit:");
        double F1 = sc.nextDouble();
        System.out.print("Final Temperature in Fahrenheit:");
        double F2 = sc.nextDouble();
    
        double InitialTemperature = (F1-32)/1.8 ; 
        double FinalTemperature = (F2-32)/1.8 ; 
        
        double Q = M*(FinalTemperature - InitialTemperature)*4184;
        System.out.printf("The energy needed is %e\n", Q);
        
    }
}