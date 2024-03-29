package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        // Q)create a list of integers and filter out the even elements only

        List<Integer> list1= List.of(2,47,31,60,36,81,100);
       // List<Integer> list2= Arrays.asList(23,44,78,34,77,31);

        //without streams
        List<Integer> evenList=new ArrayList<>();
        for(Integer i:list1)
        {
            if(i%2==0)
            {
                evenList.add(i);
            }
        }

        System.out.println("Original List: "+list1);
        System.out.println("Filtered list of even numbers without using stream api: "+evenList);

        //with stream api
        //Stream api is in java.util package...It has stream method
        List<Integer> newStreamList=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Filtered list of even numbers using stream api: "+newStreamList);

        //Filter numbers greater than 45
        List<Integer> listGreaterThan45= list1.stream().filter(i->i>45).collect(Collectors.toList());
        System.out.println("Filtered list of numbers greater than 45: "+listGreaterThan45);


    }
}
