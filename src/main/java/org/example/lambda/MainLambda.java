package org.example.lambda;

import java.util.Scanner;



public class MainLambda {

    public static void main(String[] args) {



            try {
                Scanner information = new Scanner(System.in);

                String employeeIdNumber;
                String employeeName;
                String employeeEmail;


                System.out.print("Enter your ID number: ");
                employeeIdNumber = information.next();

                System.out.print("Enter your name: ");
                employeeName = information.next();

                System.out.print("Enter your email: ");
                employeeEmail = information.next();

                //Lambda with a return statement
                LambdaTest nameAge = (id, name, email) -> {

                    return  "\n" + "This Lambda is with a return statement" +
                            "\n" + "--------------------------------------" +
                            "\n" + "ID Number: " + id +
                            "\n" + "Name: " + name +
                            "\n" + "Email: " + email +
                            "\n";
                };

                System.out.println(nameAge.test(employeeIdNumber, employeeName, employeeEmail));

                //Lambda with void method
                 LambdaTest2 nameAge2 = (id, name, email) -> {

                    System.out.println("This Lambda is with void method");
                    System.out.println("--------------------------------");
                    System.out.println("Employee ID Number: " + id);
                    System.out.println("Employee Name " + name);
                    System.out.println("Employee Email : " + email);
                };
                nameAge2.test2(employeeIdNumber, employeeName, employeeEmail);


            }
            catch(Exception error){
                System.out.println("There was an error with your input");
                }

    }

}






