import java.util.Scanner;

public class Week1Day2_ConditionState_TriangleType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();

        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                    System.out.println("Triangle is right isosceles");
                } else {
                    System.out.println("Triangle is right");
                }
            } else if (angle1 == angle2 && angle1 == angle3) {
                System.out.println("Triangle is equilateral");
            } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("Triangle is isosceles");
            } else {
                System.out.println("Triangle is not special");
            }
        } else {
            System.out.println("Not a Triangle");
        }
    }
}
