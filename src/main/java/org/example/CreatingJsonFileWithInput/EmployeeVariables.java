package org.example.CreatingJsonFileWithInput;

/*
   Collecting the data from the input into private variables. The get methods return the variable input to the main
   class (EmployeeJsonFile.java) to be added to the JSON file and to printed to the console.

   Created by Eric Thompson
    Date: March 25, 2023
    Updated: April 5, 2023
 */

public class EmployeeVariables {

    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String skillOne;
    private String skillTwo;
    private String skillThree;


    protected EmployeeVariables(String init_employeeId, String init_employeeName, String init_employeeEmail,
                             String init_skillOne, String init_skillTwo, String init_skillThree) {
        employeeId = init_employeeId;
        employeeName = init_employeeName;
        employeeEmail = init_employeeEmail;
        skillOne = init_skillOne;
        skillTwo = init_skillTwo;
        skillThree = init_skillThree;
    }

    protected String getEmployeeId() {

        return employeeId;
    }

    protected void setEmployeeId(String employeeId) {

        this.employeeId = employeeId;
    }

    protected String getEmployeeName() {

        return employeeName;
    }

    protected void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }

    protected String getEmployeeEmail() {

        return employeeEmail;
    }

    protected void setEmployeeEmail(String employeeEmail) {

        this.employeeEmail = employeeEmail;
    }

    protected String getSkillOne() {

        return skillOne;
    }

    protected void setSkillOne(String skillOne) {

        this.skillOne = skillOne;
    }

    protected String getSkillTwo() {
        return skillTwo;
    }

    protected void setSkillTwo(String skillTwo) {
        this.skillTwo = skillTwo;
    }

    protected String getSkillThree() {
        return skillThree;
    }

    protected void setSkillThree(String skillThree) {
        this.skillThree = skillThree;
    }

    
}
