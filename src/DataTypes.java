public class DataTypes {
    public static void main(String[] args) {
        // First comment

        /* Hello World
        I am working on this file
        Please do not hesitate to ask me
        If you have a questions!
         */
        // Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        //Variables: double
        double temperature = 3.4;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        //Variables: float
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        //Casting
        int areaInteger = (int) area;
        System.out.println(areaInteger);

        //Char
        char symbol = '$';
        System.out.println(symbol);

        //Exercise:
        char a = 65;
        System.out.println(a);
        char r = 82;
        System.out.println(r);
        char t = 84;
        System.out.println(t);
        char u = 85;
        System.out.println(u);
        System.out.println(r);

        //Boolean is/has
        boolean isRaining = false;
        boolean isSummer = false;
        boolean passedExam = true;
    }
}
