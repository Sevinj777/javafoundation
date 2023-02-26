package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class EmailBuilder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName=input.next();
        System.out.println("Enter your last name");
        String lastName=input.next();
        System.out.println("Enter your company name");
        String companyName=input.next();
        System.out.println("Your email address is " + firstName + lastName + "@" + companyName + ".com");

    }
}
