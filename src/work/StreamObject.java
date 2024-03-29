package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args)
    {
        //ways to create Stream object
        //1.blank stream
        Stream<Object>emptyStream=Stream.empty();

        //2.using method Stream Of
        String name[]={"Surila","Ashish","Yadhuvanshi"};
        Stream<String> nameStream= Stream.of(name);
        nameStream.forEach(s->{
            System.out.println(s);
        });

        //3.using builder method
        Stream<Object> stream1=Stream.builder().build();

        //4.using Arrays.stream
        IntStream stream2=Arrays.stream(new int[]{2,3,45,56,678});
        stream2.forEach(e->{
            System.out.println(e);
        });

        //5.using List, set
        List<Integer> list1= List.of(2,47,31,60,36,81,100);
        list1.stream();

        }
    }


