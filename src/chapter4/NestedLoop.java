package chapter4;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class NestedLoop {
    public static void main(String[] args){
        //Initialize known values
        int numberOfStudents=24;
        int numberOfTests=4;
        double score;

        Scanner scanner=new Scanner(System.in);

        for(int i=0;i<numberOfStudents;i++){
            double total=0;
            for(int j=0; j<numberOfTests;j++){
                System.out.println("Enter the score of the Test "+(j+1)+ " of the Student #" +(i+1)+ ": ");
                score=scanner.nextDouble();

                total=total+score;
            }
            double average=0;
            average=total/numberOfTests;
            System.out.println("Average test score of the Student #"+ (i+1)+ " is " + average);
        }
    }
}
