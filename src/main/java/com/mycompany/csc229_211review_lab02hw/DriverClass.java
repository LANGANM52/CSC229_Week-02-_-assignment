package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
    public static void main(String[] args) {
                short age;                  //age initialized prior to constructor to allow input
                Student std1 = new Student("James", age = 20);  //constructor test
                System.out.println(std1);                       //toString test
                Scanner myObj = new Scanner(System.in);  // Scanner object
                System.out.println("Enter your GPA");       //Prompt to enter your GPA
                std1.setGPA(myObj.nextDouble());            //GPA set to next inputed double
                System.out.println("GPA is: " + std1.getGPA());  // GPA getter print
                  
                  
 }  
}

