package day02_intro_to_variables;

public class PrintlnVSPrint {
    public static void main(String[] args) {
        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println();
        System.out.print("Line3");
        System.out.print("Line4");
    }
}
/* println prints the message and goes to next line
print prints the message and stays in same line
System.out.println(); adds an empty line
but System.out.print(); doesn't work */