package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {
//        createNewFile();
//        numbersExceptionHandling();

        createNewFileRethrow();
    }

    public static void createNewFile(){
        File file=new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

    public static void numbersExceptionHandling(){
        File file=new File("resources/numbers.txt");
//        Scanner fileReader = null;
        try(Scanner fileReader=new Scanner(file)) {
//            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num=fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }//catch (Exception e){
//
//        }

//        finally {
//            fileReader.close();
//        }
    }

    public static void createNewFileRethrow() throws Exception{
        File file=new File("resources/nonexistent.txt");
        file.createNewFile();
    }

}
