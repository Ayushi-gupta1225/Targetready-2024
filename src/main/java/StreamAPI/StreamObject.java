package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //1.empty stream
        Stream<Object> emptystream=Stream.empty();

        //2.2-array , object , collection
        String names[]={"Durgesh","uttam","ankit","Divya"};
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e-> {
            System.out.println(e);
        });

        //3.builder method
        Stream<Object> streambuilder=Stream.builder().build();

        Arrays.stream(new int[]{2,4,14,23});


    }
}