package Classwork;
import java.util.Scanner;
public class guessNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number :");
        int num = input.nextInt();


        if (num == 20){
            System.out.print("You are correct");
        }
        else if(num<20){
            System.out.print("The number is less");
        }
        else
            System.out.print("The number is too much");

    }
}