package homework;

public class myFirstHomeWork {
    public static void main(String[] args) {

        //Exercise 1: Write a Java program that checks if a given number is positive. If it is, print "Positive number."

        int x = 2;
        if (x>0) {
            System.out.println("Positive number");
        }

        //Exercise 2: Create a Java program that determines if a given integer is even. If it is, print "Even number."

        int y= 6;
        if (y % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        //Exercise 3: Write a Java program that classifies a person into different age groups based on their age. If the age is less than 18, print "Teenager," otherwise print "Adult."

        int age= 21;
        if (age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }

        //Exercise 4: Create a Java program that checks if a given year is a leap year. If it is, print "Leap year."

        int year= 2024;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        //Exercise 5: Write a Java program that checks if a given number is positive, even, and less than 100. If all conditions are true, print "Valid number."

        int number= 52;
        if (number > 0 && number %2 == 0 && number < 100) {
            System.out.println("Valid number");
        }

        //Exercise 6: Create a Java program that checks if a number is positive, and if so, check if it's even. If both conditions are true, print "Positive and Even."

        int z= 17;
        if (z > 0 && z %2 == 0) {
            System.out.println("Positive and even");
        }

        //Exercise 7: Write a Java program that determines if a given character is a vowel. If it is, print "Vowel." (Use variable with data type: char. When checking character use == and ||)

        char ch= 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        }

        //Exercise 8:Create a Java program that calculates BMI (Body Mass Index) and categorizes it into different ranges. Print the category based on the BMI. Formula: bmi = weight / (height * height)

        float weight= 81.8f;
        float height= 188f;
        float bmi= weight/ (height * height);
        System.out.println(bmi);

        //Exercise 9: Write a Java program that calculates the final grade for a student based on their scores in three subjects: Math, Science, and English. The program should take input scores for each subject and calculate the average.

        int english= 95;
        int math= 31;
        int science= 79;
        int finalGrade= (english + math + science) /3;
         if (finalGrade >= 90) {
            System.out.println("Your grade = A");
        } else if (finalGrade >= 80 && finalGrade <= 89) {
            System.out.println("Your grade = B");
        } else if (finalGrade >= 70 && finalGrade <= 79) {
            System.out.println("Your grade = C");
        } else if (finalGrade >= 60 && finalGrade <= 69) {
             System.out.println("Your grade = D");
         } else if (finalGrade < 60) {
             System.out.println("Your grade = E");
         }

        //Exercise 10: Write a Java program that takes a filename as input and checks if it has a valid file extension. Assume valid extensions are ".txt", ".doc", and ".pdf". If the file has a valid extension, print "Valid file extension," otherwise print "Invalid file extension."

        String homework= "homework.pdf";
        if (homework.endsWith(".txt") || homework.endsWith(".doc") ||homework.endsWith(".pdf")) {
            System.out.println("Valid file extension");
        } else {
            System.out.println("Invalid file extension");
        }

    }
}
