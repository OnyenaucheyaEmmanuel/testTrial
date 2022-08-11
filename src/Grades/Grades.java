package Grades;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0;
        int scores = 0;

        while (num <= 5) {
            System.out.println("ENTER SCORES");
            scores = input.nextInt();
            Grades.checkCase(scores);
            num++;
        }

    }

    private static void checkCase(int scores) {
        switch (scores) {
            case 90:
                System.out.println("A");
                break;
            case 60:
                System.out.println("B");
                break;
            case 50:
                System.out.println("C");
                break;
            case 40:
                System.out.println("D");
                break;
            case 30:
                System.out.println("E");
                break;
            case 20:
                System.out.println("F");
                break;
            default:
                System.out.println("INVALID GRADE");
        }
    }
}