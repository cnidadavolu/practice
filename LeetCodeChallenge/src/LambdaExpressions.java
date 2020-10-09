import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {

    public static void main(String[] args) {

//Iterate over list using lambda functions.
        List mylist = Arrays.asList("java8", "features", "lambda", "java8", "functions");

        mylist.forEach(n -> System.out.println(n));
        System.out.println("************");
        mylist.forEach(System.out::println);

        //filter over list using lambda funtions.
        System.out.println("************");
        mylist.stream().filter(x -> x.equals("java8")).forEach(System.out::println);
        System.out.println();

        //Map and reduce example

        //Apply 12% VAT to all the purchases in the list
        //before java8
        List<Integer> costBeforeTax = Arrays.asList(100,200,300,400,500);
        for(Integer cost: costBeforeTax){
            double price = cost + cost * 0.12;
            System.out.println(price);
        }

        System.out.println("after java8");
        //after java8
        costBeforeTax.stream().map((cost) -> cost + cost*0.12).forEach(System.out::println);

        System.out.println("after java8 conditions");

        costBeforeTax.stream().map(
                (cost) -> {
                    if (cost > 200) {
                        return cost + cost * 0.12;
                    }
                    return null;
                }).forEach(System.out::println);

        //mylist.stream().sorted().forEach(System.out::println);
        mylist.stream().sorted().forEach(System.out::println);
        System.out.println();

        List sortedList = (List) mylist.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);









    }
}
