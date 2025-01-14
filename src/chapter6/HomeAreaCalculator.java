package chapter6;

public class HomeAreaCalculator {
    public static void main(String[] args){
        //Create instance of the Rectangle class
        Rectangle room1=new Rectangle();
        room1.setLength(50);
        room1.setWidth(40);
        double areaOfRoom1= room1.calculateArea();

        Rectangle room2=new Rectangle(70,30);
        double areaOfRoom2=room2.calculateArea();

        double totalArea=areaOfRoom1+areaOfRoom2;
        System.out.println("Area of both rooms: "+totalArea);
    }
}
