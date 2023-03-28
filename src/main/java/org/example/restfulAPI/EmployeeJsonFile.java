/*

*/

package org.example.restfulAPI;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeJsonFile {

    public static void main(String[] args) {
        //Created JSONObject
        JSONObject employees = new JSONObject();
        employees.put("ID", "1");
        employees.put("Name", "Eric Thompson");
        employees.put("Email", "Thompson.eric.w@gmail.com");

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
