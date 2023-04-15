package org.example.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestingStreams {

    static String name;
    static String careerOccupation;
    static String careerStatus;
    static String addNewPerson;
    static boolean checkAddNewPerson = true;


    public static void main(String[] args) {

        Scanner enterPersonEmployment = new Scanner(System.in);

        while (checkAddNewPerson == true) {
            System.out.print("Enter Name of Person: ");
            name = enterPersonEmployment.nextLine();
            System.out.print("Enter Occupation: ");
            careerOccupation = enterPersonEmployment.nextLine();
//            System.out.println("Enter career status(Active or Retired): ");
//            careerStatus = enterPersonEmployment.next();
            System.out.print("Want to add another person?(Yes/No): ");
            addNewPerson = enterPersonEmployment.nextLine();
            if(addNewPerson.equals("No") || addNewPerson.equals("no") || addNewPerson.equals("n") || addNewPerson.equals("N")){
               checkAddNewPerson = false;
            }

        }
        enterPersonEmployment.close();

        List <People> listOfPeople = new ArrayList<>();
        listOfPeople.add(new People(name, careerOccupation, EmploymentStatus.ACTIVE));

        List <People> arrangeListOfPeople = listOfPeople.stream()
                .filter(status -> status.getPersonStatus().equals(EmploymentStatus.ACTIVE))
                .sorted(Comparator.comparing(People::getPersonName))
                .collect(Collectors.toList());

        arrangeListOfPeople.forEach(System.out::println);

    }


//    static EmploymentStatus checkEmploymentStatus(String statusOfCareer){
//
//        EmploymentStatus status = null;
//
//        if(statusOfCareer == "Active") {
//            status = EmploymentStatus.ACTIVE;
//        }
//        else if(statusOfCareer == "Retired"){
//            status = EmploymentStatus.RETIRED;
//        }
//        else{
//            System.out.println("You didn't enter Active or Retired.");
//        }
//        return status;
//    }


}
