package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 to enter the number of hours worked for the week.
 * Do not allow overtime. Max 40
 */
public class WhileLoop {
    public static void main(String[] arg){
        //Initialize known variables
        int rate=15;
        int maxHours=40;

        //Get input for unknown variable
        System.out.println("How many hours did you work this week? ");
        Scanner scanner=new Scanner(System.in);
        double hoursWorked=scanner.nextDouble();

        //Validate input
        while(hoursWorked>maxHours){
            System.out.println("Invalid entry. The worked hours must be between 1 and 40.Try again.");
            hoursWorked=scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross
        double gross=rate*hoursWorked;
        System.out.println("Gross pay: $"+gross);
    }
}
