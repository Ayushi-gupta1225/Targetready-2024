package StreamApi;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.*;

public class StreamMain1 {
    public static void main(String[] args) {
        //create a list n filter all even no. from list
        //list are immutale
        List<Integer> list1=List.of(2,4,5,6,7,8);
        System.out.println(list1);

        //old method
//         List<Integer> listeven=new ArrayList<>();
////        list2.add(12);
//        for(Integer i:list1) {
//            if (i % 2 == 0)
//                listeven.add(i);
//            System.out.println(listeven);
//        }


        //  NOW USING STREAM API
        Stream<Integer> stream=list1.stream();
      List<Integer> newstremlist=  stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newstremlist);

        //examples by sir
         List<Integer> nums = List.of(120, 390, 48, 38, 120, 392, 48, 38, 22, 382, 572, 7772, 234);

        // first 5 of the numbers:
        nums.stream()
                .limit(5)
                .forEach(System.out::println); // .forEach(num -> System.out.println(num));

        System.out.println();
        nums.stream()
                .skip(5)
                .limit(3)
                .forEach(System.out::println); // .forEach(num -> System.out.println(num));

        System.out.println();
        nums.stream()
                .filter(num -> num % 2 == 1)
                .findFirst()
                .ifPresentOrElse(num -> System.out.println("first odd number is " + num), () -> System.out.println("No odd number found"));
    

        }

}
