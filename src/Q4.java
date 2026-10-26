import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    System.out.print("Enter the number of seconds:");
    int input = sc.nextInt() ;
    int hours = input/3600;
    int minutes = (input%3600)/60;
    int seconds = (input%3600)%60;
    
        System.out.println(input + " seconds is "+ hours + " hours "+ minutes + " minutes and "+ seconds + " seconds");
    }
}