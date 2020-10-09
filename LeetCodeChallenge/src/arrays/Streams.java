package arrays;
//
//public class sample extends  BaseC implements  BaseI{
//
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
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
        for (String s : namesOfAbove25) {
            System.out.println(s);
        }

        int[] nums = {10, 20, 35, 40, 55, 100, 22};
        nums = Arrays.stream(nums).filter(num -> num > 50).toArray();
        for (int num : nums) {
            System.out.println(num);
        }
        AtomicInteger count = new AtomicInteger(1);
        new Thread(() -> System.out.println("In Java8, Lambda Expressions thread: " + count.getAndIncrement())).start();

        MyFunctionalInterface sum =  (int a, int b) -> a+b;
        System.out.println(sum);

//        public String getDay(int days, int months, int year){
//
//            Calendar cal = Calendar.getInstance();
//            cal.add(Calendar.YEAR, year);
//            cal.add(Calendar.MONTH, months);
//            cal.add(Calendar.DAY_OF_MONTH, days);
//
//            return cal;
//        }


    }

}

@FunctionalInterface
interface MyFunctionalInterface{
    public int addTwo(int x, int y);
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

