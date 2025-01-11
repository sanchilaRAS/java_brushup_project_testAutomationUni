package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */
public class LoopBreak {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter some test: ");
        String text=scanner.nextLine();
        scanner.close();

        boolean letterFound=false;

        for(int i=0;i<text.length();i++){
            char currentLetter=text.charAt(i);
            if(currentLetter=='A' || currentLetter=='a'){
                letterFound=true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text contains letter 'A'.");
        }
        else{
            System.out.println("This text does not contain letter 'A'.");
        }
    }
}
