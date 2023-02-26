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
        System.out.printf("Typecasted to float : Value = %.2f\n", f);
        System.out.printf("Typecasted to long : Value = %d\n", l);
        System.out.printf("Typecasted to int : Value = %d\n", i);
        System.out.printf("Typecasted to short : Value = %d\n", s);
        System.out.printf("Typecasted to byte : Value = %d\n", b);
    }
}