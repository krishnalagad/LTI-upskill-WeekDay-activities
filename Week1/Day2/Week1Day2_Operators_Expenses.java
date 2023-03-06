import java.util.*;
import java.io.*;

public class Week1Day2_Operators_Expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter branding expenses");
        double b = sc.nextDouble();

        System.out.println("Enter travel expenses");
        double t = sc.nextDouble();

        System.out.println("Enter food expenses");
        double f = sc.nextDouble();

        System.out.println("Enter logistics expenses");
        double l = sc.nextDouble();

        String tot = String.format("%.2f", (b + t + f + l));
        String b_exp = String.format("%.2f", ((b/(Double.valueOf(tot)))*100));
        String t_exp = String.format("%.2f", ((t/(Double.valueOf(tot)))*100));
        String f_exp = String.format("%.2f", ((f/(Double.valueOf(tot)))*100));
        String l_exp = String.format("%.2f", ((l/(Double.valueOf(tot)))*100));

        System.out.println("Total expenses: Rs." + tot);
        System.out.println("Branding expenses percentage: " + b_exp +"%");
        System.out.println("Travel expenses percentage: " + t_exp +"%");
        System.out.println("Food expenses percentage: " + f_exp+"%");
        System.out.println("Logistics expenses percentage: " + l_exp +"%");
    }
}