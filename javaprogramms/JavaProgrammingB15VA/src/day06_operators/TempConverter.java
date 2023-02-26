package day06_operators;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Fahrenheit value");
        double fahrenheit = input.nextDouble();
        double celsius;
        celsius = (fahrenheit - 32.0)*5/9;
        System.out.println(fahrenheit + " is " + celsius + " in Celsius.");

    }
}
