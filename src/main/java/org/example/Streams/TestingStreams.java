package org.example.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class TestingStreams {

    public static void main(String[] args) {
        // create an ArrayList with Object data type that accepts any data type as a value.
        // created ArrayList to hold the values that were added.
        ArrayList <Object> myList = new <Object> ArrayList();
        myList.add("Eric");
        myList.add(35);
        myList.add("thompson.eric.w@gmail.com\n");
        System.out.println("Original: ");
        myList.stream()
                .forEach(System.out::println);

        //change index 1 in the Arraylist to new value
        myList.set(1,"Thompson" + " (Changed)");
        System.out.println("Updated: ");
        myList.stream().forEach(System.out::println);

        //create a List of dog names with a String data type.
        List <String> dogNameAge = List.of("Rover","Bowser","Daisy" );

        //create a list to store the filtered dog name using Streams
         List dogList = dogNameAge.stream().
                filter(dog ->  dog == "Bowser").
                collect(Collectors.toList());

        System.out.println(dogList);


    }
}
