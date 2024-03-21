package org.example;
class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String job;
    String birthplace;


//Constructors (Total : 5 and tried all different parameter combinations with int parameter)

    //Constructor 1 (2 String, 1 int)

    public Person(String firstName,String lastName,int age){

        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    //Constructor 2 -> constructor chaining w/ Constructor 1 (3 String, 1 int)
    public Person(String firstName,String lastName,int age,String birthplace) {
        this(firstName,lastName,age);
        this.birthplace=birthplace;

    }
    // Constructor 3 -> constructor chaining w/ Constructor 2 (5 String, 1 int)
    public Person(String firstName,String lastName,int age, String gender,String job,String birthplace) {
        this(lastName,firstName,age,birthplace);
        this.age=age;
        this.gender=gender;
        this.job=job;
    }
    //Constructor 4 -> for create a different person (1 String,1 int)
    public Person (String firstName,int age) {
        this.firstName=firstName;
        this.age=age;
    }
    //Constructor 5 -> constructor chaining w/ Constructor 4 (4 String, 1 int)
    public Person (String firstName,String lastName, int age,String gender,String job){
        this(firstName,age);
        this.lastName=lastName;
        this.gender=gender;
        this.job=job;

    }
//Getters


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public static boolean isTeen (String firstName,int age) {
        if (age >= 13 && age <= 19 ) {
            System.out.println(firstName + " " + "is teen.");
            return true;
        }
        else {
            System.out.println(firstName + " " + " isn't teen.");
            return false;
        }
    }

}

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



    }

}
