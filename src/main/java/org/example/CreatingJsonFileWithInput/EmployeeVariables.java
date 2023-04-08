package org.example.CreatingJsonFileWithInput;

/*
   Collecting the data from the input into private variables. The get methods return the variable input to the main
   class (EmployeeJsonFile.java) to be added to the JSON file and to printed to the console.

   Created by Eric Thompson
    Date: March 25, 2023
    Updated: April 5, 2023
 */

public class EmployeeVariables {

    private final String employeeId;
    private final String employeeName;
    private final String employeeEmail;
    private final String skillOne;
    private final String skillTwo;
    private final String skillThree;


    protected EmployeeVariables(String employeeId, String employeeName, String employeeEmail,
                             String skillOne, String skillTwo, String skillThree) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.skillOne = skillOne;
        this.skillTwo = skillTwo;
        this.skillThree = skillThree;
    }

    protected String getEmployeeId() {

        return employeeId;
    }

    protected String getEmployeeName() {

        return employeeName;
    }

    protected String getEmployeeEmail() {

        return employeeEmail;
    }
    protected String getSkillOne() {

        return skillOne;
    }

    protected String getSkillTwo() {
        return skillTwo;
    }

    protected String getSkillThree() {
        return skillThree;
    }

}
