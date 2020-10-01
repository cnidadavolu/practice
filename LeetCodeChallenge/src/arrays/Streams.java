package arrays;
//
//public class sample extends  BaseC implements  BaseI{
//
//}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

enum Gender {
    MALE, FEMALE, OTHER
}
public class Streams {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Chaitanya", 30, Gender.MALE));
        personList.add(new Person("chai", 25, Gender.MALE));
        personList.add(new Person("iahc", 28, Gender.MALE));
        personList.add(new Person("ayantiahc", 20, Gender.FEMALE));
        personList.add(new Person("nchaa", 22, Gender.MALE));

        List<String> namesOfAbove25 = personList.stream()
                                                .filter(person -> person.getAge() >= 25)
                                                .map(Person::getName)
                                                .collect(Collectors.toList());
        for(String s: namesOfAbove25){
            System.out.println(s);
        }
    }


}

class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}


//public class TestFirstApp {
//    static void doIt(int x,int y, int m){
//        if(x==5){
//            m
//        }
//    }
//}