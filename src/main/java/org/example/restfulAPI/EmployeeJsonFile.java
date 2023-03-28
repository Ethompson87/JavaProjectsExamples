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
        //Created Scanner to collect input for ID, Name, and Email
        Scanner informationInput = new Scanner(System.in);

        System.out.println("Enter ID number: ");
        employeeId = informationInput.next();

        System.out.println("Enter Name: ");
        employeeName = informationInput.next();

        System.out.println("Enter Email: ");
        employeeEmail = informationInput.next();
        System.out.println("");

        //Created JSONObject that passed the Scanner inputs into the JSON file


        JSONObject employee = new JSONObject();
        employee.put("ID", employeeId);
        employee.put("Name", employeeName);
        employee.put("Email", employeeEmail);

        JSONObject employees = new JSONObject();
        employees.put("Employee", employee);

        //Created an JSONArray
        JSONArray list = new JSONArray();
        list.put("Java");
        list.put("JavaScript");
        list.put("HTML/CSS");

        employees.put("Skills", list);

        try(FileWriter file = new FileWriter("EmployeeFile.json")){

            file.write(employees.toString());
            file.flush();
        }
        catch (IOException e){
            System.out.println("No file created");
        }

        System.out.println(employees);

    }
}
