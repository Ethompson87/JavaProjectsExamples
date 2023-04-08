package org.example.DogNamesStreams;

import java.util.List;
import java.util.stream.Collectors;

public class PrintDogNames {
    public static void main(String[] args) {

        List<Dogs> dogList = getDogs();

        List <Dogs> doggyName = dogList.stream()
                .filter(dog ->  dog.getDogName().equals("Bowser"))
                .collect(Collectors.toList());

        doggyName.forEach(System.out::println);
    }

    private static List<Dogs> getDogs(){
        return List.of(
                new Dogs("Rover"),
                new Dogs("Daisy"),
                new Dogs("Bowser")
        );
    }
}
