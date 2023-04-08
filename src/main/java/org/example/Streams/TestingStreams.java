package org.example.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestingStreams {

    public static void main(String[] args) {

        List <People> peopleList = getPerson();

        List <People> personList = peopleList.stream()
                .filter(status -> status.getPersonStatus().equals(EmploymentStatus.ACTIVE))
                .sorted(Comparator.comparing(People::getPersonName))
                .collect(Collectors.toList());

        personList.forEach(System.out::println);

    }

    private static List<People> getPerson(){
        return List.of(
                new People("Eric Thompson", "Java Engineer", EmploymentStatus.ACTIVE),
                new People("Drew Carrey", "Comedian/Talk Show Host", EmploymentStatus.ACTIVE),
                new People("Dwayne Johnson", "Hollywood Star/ Pro Wrestler", EmploymentStatus.ACTIVE),
                new People("Robert Downey Jr","Owner/Senior Engineer", EmploymentStatus.ACTIVE),
                new People("Tom Brady","Pro Football", EmploymentStatus.RETIRED)
        );
    }

}
