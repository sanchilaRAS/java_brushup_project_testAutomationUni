package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner= new Scanner(System.in);
    public static void main(String[] args){

        HomeAreaCalculatorRedo calculator=new HomeAreaCalculatorRedo();
        Rectangle kitchen=calculator.getRoom();
        Rectangle bathroom=calculator.getRoom();
        calculator.scanner.close();


        double totalArea= calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("Total area: "+totalArea);
    }
    public Rectangle getRoom(){


        System.out.println("Enter the length of your room: ");
        double length=scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width=scanner.nextDouble();


        return new Rectangle(length,width);
    }

    public double calculateTotalArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea()+room2.calculateArea();
    }
}
