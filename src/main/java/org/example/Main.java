package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John","Doe",20,"Male","Backend Developer","NY City");
        Person person2 = new Person("Jane","Doe",17,"Boston","Student");
        Person person3 = new Person ("Burak",27);
        System.out.println("Firstname" + " " + person1.getFirstName());
        System.out.println("Lastname" + " " + person1.getLastName());
        System.out.println("Age" + " " + person1.getAge());
        System.out.println(Person.isTeen(person2.getFirstName(), person2.getAge()));
        System.out.println(Person.isTeen("Ali",37));
        //
        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());



    }

}
