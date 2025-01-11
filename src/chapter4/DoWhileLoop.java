package chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class DoWhileLoop {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        double sum;

        boolean again;

        do{
            System.out.println("Enter 1st number: ");
            double number1=scanner.nextDouble();

            System.out.println("Enter 2nd number: ");
            double number2=scanner.nextDouble();

            sum=number1+number2;
            System.out.println("Sum of the "+number1+ " and "+number2+ " is "+sum);

            System.out.println("Would you like to start over? Type True or False.");
            again=scanner.nextBoolean();

        }while(again);

        scanner.close();
    }
}
