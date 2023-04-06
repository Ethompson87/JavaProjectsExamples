package org.example.CreatingJsonFileWithInput;

/*
   Collecting the data from the input into private variables.

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


    public EmployeeVariables(String init_employeeId, String init_employeeName, String init_employeeEmail,
                             String init_skillOne, String init_skillTwo, String init_skillThree) {
        employeeId = init_employeeId;
        employeeName = init_employeeName;
        employeeEmail = init_employeeEmail;
        skillOne = init_skillOne;
        skillTwo = init_skillTwo;
        skillThree = init_skillThree;
    }

    public String getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(String employeeId) {

        this.employeeId = employeeId;
    }

    public String getEmployeeName() {

        return employeeName;
    }

    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {

        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {

        this.employeeEmail = employeeEmail;
    }

    public String getSkillOne() {

        return skillOne;
    }

    public void setSkillOne(String skillOne) {

        this.skillOne = skillOne;
    }

    public String getSkillTwo() {
        return skillTwo;
    }

    public void setSkillTwo(String skillTwo) {
        this.skillTwo = skillTwo;
    }

    public String getSkillThree() {
        return skillThree;
    }

    public void setSkillThree(String skillThree) {
        this.skillThree = skillThree;
    }

    
}
