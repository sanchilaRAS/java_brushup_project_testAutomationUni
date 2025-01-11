package chapter3;

import java.util.Scanner;

public class IfStatement {
    /*
    If statement
    All salesperson get a payment of $1000
    Salesperson who exceed 10 sales get an additional bonus 0f $250
    */
    public static void main(String[] args) {

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee made this week?: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour fpr the bonus earners
        if(sales>quota){
            salary=salary+bonus;
        }

        //Output
        System.out.println("The employee's salary is $"+salary);
    }
}
