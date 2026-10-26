
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Random rand = new Random ();
        int A = rand.nextInt(41)+10;
        int B = rand.nextInt(41)+10;
        int C = rand.nextInt(41)+10;
        double sum = (A+B+C);
        double average = sum/3;
        
        System.out.println("A = "+A + "B = "+B + "C= "+C);
        System.out.println("Sum of three numbers= "+ sum);
        System.out.printf("Average of the three numbers:%.2f\n", average);
        
        
    }
}