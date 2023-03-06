import java.util.Scanner;

public class Week1Day3_Looping_Pattern8_Italy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = 1; i <= a; i++) {
            for(int j = 1; j <= a*3/2; j++){
                if (j > a/2 && j < a + 1) {
                    System.out.print("# ");
                } else if (j <= a/2) {
                    System.out.print("( ");
                } else {
                    System.out.print(") ");
                }
            }
            System.out.println();
        }
    }
}
