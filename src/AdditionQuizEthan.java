//Author: Ethan Lowery//
//date:June 2 2022//
//version 1.0//
//Description: this program uses if else to make a basic addition question//


import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[] args) {

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() * 7 % 10);
        System.out.println(number1);
        System.out.println(number2);
        System.out.print("what is " + number1 + " + " + number2 + "= ? ");
        java.util.Scanner consolInput = new java.util.Scanner(System.in);
        int answer = consolInput.nextInt();

        if (answer == number1 + number2) {
            System.out.println("Great job that is correct.");
        }
            else  {
            System.out.println("Sorry that isn't correct.");
        }

    }}
