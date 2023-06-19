package lv.acodemy.classroom;

import static lv.acodemy.classroom.Sizes.*;

public class ObjectPractice {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        String catName = barsik.getName();

        //name = null
        System.out.println(catName);
        System.out.println(barsik);

        // name = Barsikzftw
        barsik.setName("Barsikzftw");
        System.out.println(barsik);

        // age = 5
        barsik.setAge(5);
        System.out.println(barsik);
        System.out.println("My cat is: " + barsik.getAge() + "years old.");

        // Create getter and setter for weight, color, size;
        // Set data using setters;
        barsik.setWeight(30.1);
        System.out.println(barsik);


        barsik.setColor("green");
        System.out.println(barsik);
        barsik.setSize(M);

        System.out.println(barsik);

        Animal ballzik = new Animal(13, "Ballzik");
        // My name is Ballzik. I am 13 years old.
        System.out.printf("My name is %s. I am %d old\n", ballzik.getName(), ballzik.getAge());

        Animal duck = new Animal(12, 7.77, "pink", L, "Duckpuck", true);
        System.out.println(duck);

        duck.speak();
        duck.feed("waurma");

        duck.speak();
        System.out.println();

    }
}
