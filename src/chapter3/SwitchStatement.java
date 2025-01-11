package chapter3;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        System.out.println("Enter your letter grade: ");
        Scanner scanner=new Scanner(System.in);
        String grade=scanner.next();
        scanner.close();

        switch (grade){
            case "A":
                System.out.println("Excellent job!");
                break;
            case "B":
                System.out.println("Grate job!");
                break;
            case "C":
                System.out.println("Good job!");
                break;
            case "D":
                System.out.println("You need to work a bit harder.");
                break;
            case "F":
                System.out.println("Uh Oh!");
                break;
            default:
                System.out.println("Error! Invalid Input.");
                break;

        }

    }
}
