package org.example.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestingStreams {

    static String name;
    static String careerOccupation;
    static String state;
    static String addNewPerson;
    static boolean checkAddNewPerson = true;



    public static void main(String[] args) {

        Scanner enterPersonEmployment = new Scanner(System.in);

        List <People> listOfPeople = new ArrayList<>();

        while (checkAddNewPerson) {
            try {
                System.out.print("Enter Name of Person: ");
                name = enterPersonEmployment.nextLine();

                System.out.print("Enter Occupation: ");
                careerOccupation = enterPersonEmployment.nextLine();

                System.out.print("Enter State of Residency: ");
                state = enterPersonEmployment.nextLine();

                listOfPeople.add(new People(name, careerOccupation, state.toUpperCase()));

                System.out.print("Want to add another person?(Yes/No): ");
                addNewPerson = enterPersonEmployment.nextLine();

                System.out.println("------------------------");

                if (addNewPerson.equals("No") || addNewPerson.equals("no") || addNewPerson.equals("n") || addNewPerson.equals("N")) {
                    checkAddNewPerson = false;
                } else if (addNewPerson.equals("Yes") || addNewPerson.equals("yes") || addNewPerson.equals("y") || addNewPerson.equals("Y")) {
                    checkAddNewPerson = true;

                } else {
                    System.out.println("You didn't select Yes or No, so by default the program selected \"No\"");
                    checkAddNewPerson = false;
                }

            } catch (Exception e) {
                System.out.println("There was a problem with your data.");

            }
        }
        enterPersonEmployment.close();



        List <People> arrangeListOfPeople = listOfPeople.stream()
                .filter(status -> status.getPersonState().equals(StateOfResidency.CALIFORNIA.toString()))
                .sorted(Comparator.comparing(People::getPersonName))
                .toList();

        arrangeListOfPeople.forEach(System.out::println);

    }

}

