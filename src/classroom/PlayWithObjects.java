package classroom;

public class PlayWithObjects {
    public static void main(String[] args) {

        Animal barsik= new Animal();
        barsik.setName("Barsik");
        barsik.setAge(1);
        barsik.setColor("Red");
        System.out.println(barsik.getName());

        Animal leo = new Animal();
        leo.setName("Leo");
        leo.setAge(3);
        leo.setColor("Orange");
        System.out.println(leo.getName());

        System.out.println(barsik);
        System.out.println(leo);

        barsik.walk();
        leo.walk();

        barsik.eat();
        leo.eat();

        //Create 2 objects;
        //Update info for each;
        //Call walk and eat;

        Animal olenj = new Animal();
        olenj.setName("Erik");
        olenj.setAge(23);
        olenj.setColor("Brown");
        System.out.println(olenj);
        olenj.walk();
        olenj.eat();

        Animal duck = new Animal();
        duck.setName("Igor");
        duck.setAge(52);
        duck.setColor("Grey");
        System.out.println(duck);
        duck.walk();
        duck.eat();

    }
}
