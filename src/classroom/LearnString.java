package classroom;

public class LearnString {
    public static void main(String[] args) {
        //String
        String name= "Artur";
        String lastname= "Licitis";

        System.out.println(name);
        System.out.println(lastname);

        //Exercise: print name and surname
        String fullName = name + " " + lastname;
        System.out.println(fullName);

        //Same example
        System.out.println(name + " " + lastname);

        System.out.println(String.format("%s %s", name, lastname));

        //Can save into variable
        String myFullName= String.format("%s %s", name, lastname) ;

        //Hello, World
        String hello= "hello";
        String world= "world";

        String helloWorld= hello.concat(world);
        System.out.println(helloWorld);

        /*
        Exercise
        Step 1: Declare a string with your name
        Step 2: Declare a string with your favourite programming language
        Step 3: Contenate the two strings to form a message "My name is (NAME). I love coding in (LANGUAGE)"
        Step 4: Print it out
        */

        String myName = "Artur";
        String language= "Java";

        System.out.println( String.format("My name is %s.I love coding in %s", myName, language));


    }


}
