package day06_operators;
import java.util.Scanner;
public class MinutesToHours {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int minute = input.nextInt();
        System.out.println(minute + " minutes is " + (minute/60) + " hours " + (minute%60) + " minutes");
    }
}
// next() stores only first word (until first space)
// nextLine() stores whole line