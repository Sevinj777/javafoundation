package day03_primitives_mathoperators;
import java.util.Scanner;
public class WhatIsYourNameScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);// create a scanner object

        System.out.println("What's your name?");
        String name = input.next();
        System.out.println("Nice to meet you, "+name);

    }
}
