package day_7_switch_scanner;
import java.util.Scanner;


public class Topic6_Scanners {

    public static void main(String[] args) {
        //scanner is a library under java
        //this library has ready methods that you can use it
        //to be able to use this library we need to call them in our class
        //and create object from that library

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        byte byteNumber = sc.nextByte();

        System.out.println("The byteNumber is : "+byteNumber);






    }




}
