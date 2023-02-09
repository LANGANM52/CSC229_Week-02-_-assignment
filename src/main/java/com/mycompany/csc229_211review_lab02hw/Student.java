package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {      //Student class made a child of Person

    String n;                             //name'n' and age'a' initialized
    short a;
    double GPA;                               //GPA initialized
    Student(String name, short age) {         //Student Overloaded constructor with 2 parameters
        super(name, age);
        n = name;
        a = age;
    }
    
    @Override
    public String toString(){                   //toString method added
    return n+" "+a;  
    }  
    
    public double getGPA() {                               //GPA getter
		return GPA;
	}
	
    public void setGPA(double GPA) {                               //GPA setter
		this.GPA = GPA;
	}
	
	

    @Override
    public String getAddress() {        //implemented abstract methods
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    

}