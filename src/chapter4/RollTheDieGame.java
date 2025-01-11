package chapter4;

import java.util.Scanner;

public class RollTheDieGame {
    public static void main(String[] arg){
        int spacesOfTheBoard=20;
        int maxDieRollAttempts=5;
        int random;
        Scanner scanner = new Scanner(System.in);
        int currentPosition=0;
        System.out.println("game Starting...");

        for(int i=0;i<maxDieRollAttempts;i++){
            int remaining=0;



            System.out.println("Press Enter to roll the die ...");

            // Wait for the user to press Enter
            scanner.nextLine();
            System.out.println("Die rolling attempt "+(i+1));
            random=(int) (Math.random()*6)+1; //generating a number between 1-6;
            System.out.println("You got the number "+ random);

            currentPosition=currentPosition+random;
            if(currentPosition<spacesOfTheBoard && i!=4) {
                System.out.println("Moving " + random + " spaces");
                remaining = spacesOfTheBoard - currentPosition;
                System.out.println("You are in the space " + currentPosition + ". you need to climb " + remaining + " spaces more to win.");
            }
            else if(i<4){
                System.out.println("Sorry, you cannot move. Press enter to roll the die again.");
                continue;

            }
            else{
                if (currentPosition<spacesOfTheBoard) {
                    System.out.println("You are in the space " + currentPosition + ".");
                }
                else{
                    System.out.println("Sorry,You got the number "+random+ " unable to move further.");
                    }
                System.out.println("You have rolled the die 5 times. No more attempts remained.");
            }

        }
        if(currentPosition==spacesOfTheBoard){
            System.out.println("Congrats! You Win.");
        }
        else{
            System.out.println("Sorry! You lost.");
        }
    }
}
