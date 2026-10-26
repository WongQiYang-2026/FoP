import java.util.Random;
public class Q5 {
    public static void main(String[] args) {
    Random rand = new Random();
    int number = rand.nextInt(10001);
    System.out.println("The number is "+ number);
    int sum = 0;
            
            while(true){
                int digit = number%10;
                sum += digit;
                number = number/10;
                if(number==0)
                    break;
            }
    System.out.println("The sum of all digits in the number is "+ sum);            
            
    }
}