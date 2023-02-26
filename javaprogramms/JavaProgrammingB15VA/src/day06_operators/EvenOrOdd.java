package day06_operators;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%2==1) System.out.println(a + " is an odd number");
        else System.out.println(a + " is an even number");
    }
}
