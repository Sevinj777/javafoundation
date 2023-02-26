package day06_operators;
import java.util.Scanner;
public class DayToMinute {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of days");
        int day = input.nextInt();
        int minute = day*1440;
        System.out.println(minute);
    }
}
