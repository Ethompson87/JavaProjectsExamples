package org.example.lambda;

import java.util.Scanner;



public class MainLambda {
    public static void main(String[] args) {

        Scanner information = new Scanner(System.in);

        String name;
        int age;
        boolean restartInput;

        while (restartInput = true) {

            try {

                System.out.print("Enter your name: ");
                name = information.next();


                if (Integer.parseInt(name) == Integer.parseInt(name)) {
                    System.out.println("This isn't a character.");
                    restartInput = true;
                }


                System.out.print("Enter your current age: ");
                age = information.nextInt();


                //Lambda with a return statement
                LambdaTest nameAge = (na, ag) -> {

                    return "\n" + "This Lambda is with a return statement" + "\n" + "Your name is " + na + "\n" + "Your age is : " + ag + "\n";
                };

                System.out.println(nameAge.test(name, age));

                //Lambda with void method
                LambdaTest2 nameAge2 = (na, ag) -> {

                    System.out.println("This Lambda is with void method");
                    System.out.println("Your name is " + na + "\n" + "Your age is : " + ag);
                };
                nameAge2.test2(name, age);
            } catch (Exception error) {
                System.out.println("There was an error with your request");
            }
        }
    }

}






