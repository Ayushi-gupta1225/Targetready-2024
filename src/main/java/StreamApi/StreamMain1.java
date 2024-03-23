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

        }

}