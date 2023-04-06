package org.example.restfulAPI;

public class EmployeeVariables {

    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String skillOne;
    private String skillTwo;
    private String skillThree;


    public EmployeeVariables(String employeeId, String employeeName, String employeeEmail, String skillOne, String skillTwo, String skillThree) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.skillOne = skillOne;
        this.skillTwo = skillTwo;
        this.skillThree = skillThree;
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
