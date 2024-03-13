package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {

        //Array
        //Bread; Eggs; Milk; Fruits;

        String[] shoppingList = {"Bread", "Eggs", "Milk", "Fruits"};

        int[] grades= {7,9,6,5,4};

        String[] seasons= {"Winter", "Spring", "Summer", "Autumn"};

        String eggs= shoppingList[1];
        System.out.println(eggs);

        System.out.println(grades[4]);

        //Print all grades
        System.out.println(Arrays.toString(grades));

        //Create empty array
        int[] emptyArray= new int[4];
        System.out.println(Arrays.toString(emptyArray));

        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3]= 4;
        System.out.println(Arrays.toString(emptyArray));

        //Create string array with names
        //Name count should be 5
        //And print them all

        String[] names= {"Artur", "Aleksey", "Ivan", "Janis", "Igor"};
        System.out.println(Arrays.toString(names));

        //Create empty double array
        //Print empty array
        //Update each array value from 0 to a number of your choice

        double[] emptyArray2= new double[5];
        System.out.println(Arrays.toString(emptyArray2));

        emptyArray2[0] = 0;
        emptyArray2[1]= 3;
        emptyArray2[2]= 7;
        emptyArray2[3]= 2;
        emptyArray2[4]= 8;

        System.out.println(Arrays.toString(emptyArray2));
        
        //Loops
        //Print numbers from 0 to 10

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }

        //Calculate sum from 0 to 100
        //Example: 1+2+3+4+...n

        int summa= 0;
        for (int i = 0; i <=100 ; i++) {
        summa= summa + i;
            System.out.println("Sum:" + summa);
        }

        //for ->

        for(int i= 0; i<shoppingList.length;i++ ) {
            System.out.println(shoppingList[i]);
        }

        for (String s: shoppingList) {
            System.out.println(s);
        }

        //Print numbers from 10 to 0
        for (int i= 10; i>=0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >=0) {
            System.out.println(counter);
            counter --;
        }

        System.out.println("");

        //Print even numbers from 0 to 100
        counter = 2;
        while (counter <=100) {
            System.out.println(counter);
            counter = counter +2;
        }

    }
}
