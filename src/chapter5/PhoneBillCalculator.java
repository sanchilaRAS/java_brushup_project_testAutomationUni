package chapter5;

import java.util.Scanner;

//Enter base cost of the plan:
//82.45
//Enter overage minutes:
//9
//Phone Bill Statement
//Plan: $82.45
//Overage: $2.25
//Tax: $12.71
//Total: $97.41
/*
allow the user to input the plan fee and the number of overage minutes. And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.

I want you to create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.

Please print this as an itemized bill
 */
public class PhoneBillCalculator {
    public static Scanner scanner= new Scanner(System.in);
    public static double baseCost;
    public static double taxPercentage=0.15;
    public static double overageCostPerMinute=0.25;
    public static void  main(String[] args){

        baseCost=getBaseCost();
        int overageMinutes=getOverageMinutes();
        scanner.close();
        double overageMinutesCost=calculateOverageMinutesCost(overageMinutes, overageCostPerMinute);
        double taxFee=calculateTaxFee(baseCost,overageMinutesCost,taxPercentage);
        double total=calculateTotalBillFee(baseCost,overageMinutesCost,taxFee);
        printTheBill(baseCost,overageMinutesCost,taxFee,total);
    }
    public static double getBaseCost(){
        System.out.println("Enter base cost of the plan: ");
        return scanner.nextDouble();
    }
    public static int getOverageMinutes(){
        System.out.println("Enter overage minutes: ");
        return scanner.nextInt();
    }
    public static double calculateOverageMinutesCost(int overageMinutes, double overageCostPerMinute){
        double overageMinutesCost= overageMinutes*overageCostPerMinute;
        return overageMinutesCost;
    }
    public static double calculateTaxFee(double baseCost, double overageMinutesCost, double taxPercentage){
        double taxFee=(baseCost+overageMinutesCost)*taxPercentage;
        return taxFee;
    }
    public static double calculateTotalBillFee(double baseCost,double overageMinutesCost, double taxFee){
        double totalFee=baseCost+overageMinutesCost+taxFee;
        return totalFee;
    }
    public static void printTheBill(double planFee,double overageFee, double taxFee, double total){
        System.out.println("Phone Bill Statement: ");
        System.out.println("Plan:    "+planFee);
        System.out.println("Overage: "+overageFee);
        System.out.println("Tax:     "+taxFee);
        System.out.println("Total:   "+total);

    }
}
