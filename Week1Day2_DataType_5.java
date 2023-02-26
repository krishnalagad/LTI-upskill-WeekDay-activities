import java.util.Scanner;

public class Week1Day2_DataType_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a double value");
        double d = input.nextDouble();

        float f = (float) d;
        long l = (long) d;
        int i = (int) d;
        short s = (short) d;
        byte b = (byte) d;

        System.out.println("Double value  = " + d);
        System.out.println("Typecasted to float : Value  = " + f);
        System.out.println("Typecasted to long : Value  = " + l);
        System.out.println("Typecasted to int : Value  = " + i);
        System.out.println("Typecasted to short : Value  = " + s);
        System.out.println("Typecasted to byte : Value  = " + b);
    }
}