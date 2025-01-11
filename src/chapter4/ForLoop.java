package chapter4;
import java.util.*;
/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class ForLoop {
    public static void main(String[] args){
        //Get number of items to scan
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of items would you like to scan: ");
        int itemCount=scanner.nextInt();


        double total=0;

        for(int i=0;i<itemCount;i++){
            System.out.println("Enter the price of the item "+(i+1)+ " $:");
            double price=scanner.nextDouble();

            total=total+price;
        }
        scanner.close();
        System.out.println("Total price is $ "+total);

    }
}

