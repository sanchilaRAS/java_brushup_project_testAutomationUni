package chapter3;

import java.util.Scanner;

/*
100 pennies = $1.00
20 nickels = $1.00
10 dimes = $1.00
4 quarters = $1.00
 */
public class ExerciseTwoCoinsGame {
    public static void main(String[] args) {
        int numberOfPennies;
        int numberOfNickels;
        int numberOfDimes;
        int numberOfQuarters;
        double oneDollarValue=1.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies do you have? ");
        numberOfPennies=scanner.nextInt();

        System.out.println("How many nickels do you have? ");
        numberOfNickels=scanner.nextInt();

        System.out.println("How many dimes do you have? ");
        numberOfDimes=scanner.nextInt();

        System.out.println("How many quarters do you have? ");
        numberOfQuarters=scanner.nextInt();
        scanner.close();

        double dollarAmount=(numberOfPennies*0.01)+(numberOfNickels*0.05)+(numberOfDimes*0.10)+(numberOfQuarters*0.25);

        if(dollarAmount==oneDollarValue){
            System.out.println("Congrats! You Win.");
        }
        else{
            if(dollarAmount<1.00) {
                double lessAmount = oneDollarValue - dollarAmount;
                System.out.println("You went $"+lessAmount+ " under $1.");
            }
            else {
                double overAmount=dollarAmount-oneDollarValue;
                System.out.println("You went $"+overAmount+ " over $1.");
            }
        }
    }

}
