package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {

        //"If" statement
        int x= 10;
        if (x>5) {
            System.out.println("x is greater than 5");
        }

        if (x>12) {
            System.out.println("x is greater than 12");
        }

        boolean isSpring= false;
        if (isSpring) {
            System.out.println("It is Spring");
        }

        //IF-ELSE
        int age= 25;

        if (age<=12) {
            System.out.println("This is child");
        } else {
            System.out.println("Something else");
        }

        //IF-ELSE, IF-ELSE
        if (age<=12) {
            System.out.println("This is child");
        } else if (age >=13 && age <= 19) {
            System.out.println("This is teenager");
        } else if (age>=20 && age <= 59) {
            System.out.println("This is adult");
        } else {
            System.out.println("This is senior");
        }

        //Exercise: positive/negative/zero number

        int number= 2;
        if (number >0) {
            System.out.println("This is positive number");
        } else if (number <0) {
            System.out.println("This is negative number");
        } else {
            System.out.println("Number zero");
        }

       //Exercise: Time of the day

       int hour= 17;
       if (hour >= 0 && hour <= 11) {
            System.out.println("Good morning!");
        } else if (hour >= 12 && hour <= 17) {
           System.out.println("Good afternoon!");
        } else if (hour >= 18 && hour <= 23) {
           System.out.println("Good evening!");
       } else {
           System.out.println("Invalid hour provided");
       }


    }
}
