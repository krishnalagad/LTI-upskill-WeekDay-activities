import java.util.Scanner;

public class Week1Day2_Operators_Temp2Faran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature in Celsius:");
        int temp = sc.nextInt();

        double val = Double.valueOf(temp);
        double far = (val * 9 / 5) + 32;

        String result = String.format("%.1f", far);
        System.out.println("Temperature in Fahrenheit is " + result + "F");
    }
}
