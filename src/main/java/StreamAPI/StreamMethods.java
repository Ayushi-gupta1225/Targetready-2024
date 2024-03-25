package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //filter(Predicate)
            //boolean value fxn
            //e->

        //map
        List<String> names= List.of("a","b","ac","avc");
      List<String> newnames=  names.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
        System.out.println(newnames);
        List<Integer> li=List.of(2,3,4,5,6);
        List<Integer> square=li.stream().map(i->i*i ).collect(Collectors.toList());
        System.out.println(square);
    }
}
