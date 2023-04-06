package Problem2_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for length, width and depth: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int depth = sc.nextInt();
        Box<Integer, Integer, Integer> box = new Box<>(length, width, depth);
        box.print();
    }

}