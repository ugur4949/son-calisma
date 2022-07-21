package a_denemeler;

import java.util.Scanner;

public class deneme_banka2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int current = 1000;

        System.out.println("Please select number");

        System.out.println("1-) Current Balance\n2-) Deposit cash Money\n3-) Withdrow Cash Money");


        int islem = scan.nextInt();

        switch (islem){

            case 1:
                System.out.println("Current Balance " + current );


                break;
            case 2:
                System.out.println("Please enter deposit amount");
                int deposit = scan.nextInt();
                System.out.println("deposit amount " + deposit );

                System.out.println(  "Current Balance " + (deposit+current) );
                break;
            case 3:
                System.out.println("Please enter withdraw money amount");
                int withdraw = scan.nextInt();
                System.out.println(" withdraw money amount " + withdraw );
                current = current - withdraw;

                System.out.println(" Current Balance " + ( +current));
                break;
            case 4:
                System.out.println("invalid process");
            default:
                System.out.println("error");




        }




    }

}
