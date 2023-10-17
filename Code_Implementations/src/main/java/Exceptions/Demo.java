package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Hey");
        while (true){
            System.out.println("Enter the 2 numbers to divide");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                int z = x/y;
                System.out.println("Output is :" + z);
            }catch (ArithmeticException e){
                System.out.println("hiii");
            }
            finally{
                    System.out.println("I am last line to execute");
                }
            System.out.println("Heyyyy");


        }


    }

}
