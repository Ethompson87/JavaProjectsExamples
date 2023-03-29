/*

*/

package org.example.restfulAPI;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeJsonFile {

    public static void main(String[] args) {

        String employeeId;
        String employeeName;
        String employeeEmail;
        String skillOne;
        String skillTwo;
        String skillThree;


        //Created Scanner to collect input for ID, Name, and Email
        Scanner informationInput = new Scanner(System.in);
        try {

            System.out.print("Enter ID number: ");
            employeeId = informationInput.next();

            System.out.print("Enter Name: ");
            employeeName = informationInput.next();

            System.out.print("Enter Email: ");
            employeeEmail = informationInput.next();

            System.out.print("Enter first skill: ");
            skillOne = informationInput.next();

            System.out.print("Enter second skill: ");
            skillTwo = informationInput.next();

            System.out.print("Enter third skill: ");
            skillThree = informationInput.next();

            System.out.print(" ");

            //Created an JSONArray with the skills. skillList is added to the JSONObject list.

            JSONArray skillsList = new JSONArray();
            skillsList.put(skillOne);
            skillsList.put(skillTwo);
            skillsList.put(skillThree);

            //Create am JSONObject that lists ID, Name, Email, and Skills(JSONArray)
            JSONObject employee = new JSONObject();
            employee.put("ID", employeeId);
            employee.put("Name", employeeName);
            employee.put("Email", employeeEmail);
            employee.put("Skills", skillsList);

            //Create JSONObject to add the JSONObject(list)
            JSONObject employees = new JSONObject();
            employees.put("Employee", employee);

            //Write the information to a JSON file (filename: EmployeeFile.json)
            try (FileWriter file = new FileWriter("EmployeeFile.json")) {

                file.write(employees.toString());
                file.flush();

            } catch (IOException writer) {
                System.out.println("No file created");
            }
            //Print the JSONObject to display the employee information that was sent to Employee.json file.
            System.out.println(employees);

        }
        catch(Exception input){
            System.out.println("There was a problem with your data input.");
        }
    }
}
