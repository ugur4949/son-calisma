package day_5_ifstatements;

public class  Topic2_IfStatement {

    public static void main(String[] args) {

        // If is a condition where it decide if the code block should run or not
        /*
        if(condition "true"){
        hello
        go this way
        so on
        }
         */

        String name = "Class, This is the code block";
        int var1 = 10;

        if(var1 == 10){

            System.out.println(name);
        }

        System.out.println("This is outside of If Statement");

        if(10>11){
            System.out.println(" this is none sense");
        }

        String name1 = "Ziya";

        if (name1 == "ugur") {

            System.out.println(name1);

        }

        int a = 10;

        if(a++ == 11){

            System.out.println("a is 11");
        }
        if(a ==11){
            System.out.println("this is the second line");
        }

    }


}
