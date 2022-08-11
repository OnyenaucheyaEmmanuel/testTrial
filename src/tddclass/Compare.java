package tddclass;

import java.util.Scanner;

public class Compare {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter First Number : ");

            int firstNumber = input.nextInt();

            System.out.print("Enter Second Number : ");

            int secondNumber = input.nextInt();

            if(firstNumber == secondNumber) {
                System.out.printf("%d == %d%n", firstNumber, secondNumber);
            }
            else if  (firstNumber != secondNumber) {
                System.out.printf("%d !=%d%n", firstNumber, secondNumber);
            }

            if (firstNumber > secondNumber) {
                System.out.printf("%d > %d%n", firstNumber, secondNumber);
            }
            else if (firstNumber < secondNumber) {
                System.out.printf("%d < %d%n", firstNumber, secondNumber);
            }
            if (firstNumber >= secondNumber) {
                System.out.printf("%d >= %d%n", firstNumber, secondNumber);
            }
            else if (firstNumber <= secondNumber) {
                System.out.printf("%d <= %d%n", firstNumber, secondNumber);
            }

        }









    }


