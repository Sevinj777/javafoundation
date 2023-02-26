package day05_practice_scanner_math;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.next();
        System.out.println("What's your year of birth?");
        int dayOfBirth = input.nextInt();
        System.out.println("What's current year?");
        int currentYear = input.nextInt();
        System.out.println(name + "'s age is " + (currentYear-dayOfBirth));
    }
}
