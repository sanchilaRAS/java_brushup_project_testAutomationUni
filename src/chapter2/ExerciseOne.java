package chapter2;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //1. Asking for a season
        System.out.println("Enter a name of a season: ");
        String season = scanner.nextLine();

        //2. Asking for a whole number
        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();

        //3. Asking for an adjective
        System.out.println("Enter an adjective: ");
        scanner.nextLine();
        String adjective = scanner.nextLine();

        scanner.close();

        //4.Print the whole sentence
        System.out.println("On a "+adjective+ " "+ season +" day, I drink a minimum of "+number+ " cups of coffee.");
    }
}
