package day_5_ifstatements;

public class Topic6_IfElseExample {


    public static void main(String[] args) {


        String Person1Name = "Serdar";
        double Person1H = 1;
        int Person1age = 21;

        if(Person1age<24 || Person1H>6){
            System.out.println(Person1Name +" has been accepted for basketball");
        }
        else {
            System.out.println(Person1Name + " is not  qualified");
        }



    }


}
