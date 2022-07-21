package a_denemeler;

import java.util.Scanner;

public class banka_girisi {
    public static void main(String[] args) {

        String name = "ugur";
        String parola = "123";

        Scanner scan = new Scanner(System.in);



        System.out.println("Please sign your username");

        String username= scan.next();

        System.out.println("please passwort");

        String pass = scan.next();




        if((username.equals(name)) && (parola.equals(pass))) {
            System.out.println("correct");

        }else if ( !(username.equals(name)) && (parola.equals(pass))) {
            System.out.println("Invalid Username");
        } else if ( (username.equals(name)) && !(parola.equals(pass))    ) {
            System.out.println("invalid passwort");
        } else {
            System.out.println("stop transmition");
        }


    }
}
