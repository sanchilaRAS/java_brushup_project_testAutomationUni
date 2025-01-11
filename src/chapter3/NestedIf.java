package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] arg) {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsOfEmployed = 2;

        //Get what we don't
        System.out.println("Enter your monthly salary:");
        Scanner scanner=new Scanner(System.in);
        double salary= scanner.nextDouble();

        System.out.println("Enter your years of experience:");
        double years=scanner.nextDouble();
        scanner.close();

        //Make decision
        if(salary>=requiredSalary){
            if (years>=requiredYearsOfEmployed){
                System.out.println("Congratulations! You qualify for the loan.");
            }
            else{
                System.out.println("Sorry! You are required at least "+requiredYearsOfEmployed+ " years of experience to qualify for the loan.");
            }
        }
        else
            System.out.println("Sorry! You must earn at least "+requiredSalary+ " to qualify for the loan.");
    }
}
