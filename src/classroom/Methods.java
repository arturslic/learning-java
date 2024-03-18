package classroom;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSum(46, 20));

        //Print hello world 10 times;

        printTextMultipleTimes("Hello World!", 5);

        //Call method printAllValuesFromStringArray;
        //You pass: array with fruits;

        String[] fruits = {"Apple", "Banana", "Orange", "Kiwi"};
        printAllValuesFromStringArray(fruits);

        //Sum of numbers

        int[] numbers = {2, 7, 8, 9, 3};
        int arraySum= sumOfNumbers(numbers);
        System.out.println(arraySum);




    }

    public static int calculateSum (int x, int y) {
        return x + y;
    }

    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

    //Task: create method that receives String array and prints all values;

    public static void printAllValuesFromStringArray(String[] stringArray) {
        for (int i = 0; i <stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    //Task: create method thar returns true if number is even or false if number is odd;

    public static boolean isEven(int number) {
        boolean result = number % 2 == 0;
        return result;
    }

    //Task: create method that accepts int array and returns sum of number;

    public static int sumOfNumbers(int[] numbers) {
        int summa= 0;
        for (int i = 0; i <numbers.length ; i++) {
            summa = summa + numbers[i];
        }
        return summa;
    }

}
