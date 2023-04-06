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

        //Created Scanner to input information into variables and created an instance of the EmployeeVariables class
        Scanner informationInput = new Scanner(System.in);


        try {

            System.out.print("Enter ID number: ");
            String employeeId = informationInput.next();

            System.out.print("Enter Name: ");
            String employeeName = informationInput.next();

            System.out.print("Enter Email: ");
            String employeeEmail = informationInput.next();

            System.out.print("Enter first skill: ");
            String skillOne = informationInput.next();

            System.out.print("Enter second skill: ");
            String skillTwo = informationInput.next();

            System.out.print("Enter third skill: ");
            String skillThree = informationInput.next();

            EmployeeVariables variables = new EmployeeVariables(employeeId, employeeName, employeeEmail,
                    skillOne, skillTwo, skillThree){

            };






            //Created an JSONArray with the skills. skillList is added to the JSONObject employee.

            JSONArray skillsList = new JSONArray();
            skillsList.put(variables.getSkillOne());
            skillsList.put(variables.getSkillTwo());
            skillsList.put(variables.getSkillThree());

            //Create am JSONObject that lists ID, Name, Email, and Skills(JSONArray)
            JSONObject employee = new JSONObject();
            employee.put("ID", variables.getEmployeeId());
            employee.put("Name", variables.getEmployeeName());
            employee.put("Email", variables.getEmployeeEmail());
            employee.put("Skills", skillsList);

            //Create JSONObject to add the JSONObject(employee)
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
