/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc3activity;
//import java.util.Scanner;
/**
 *
 * @author valterandremachado
 */
public class StudentInfo {
//        Scanner sc = new Scanner(System.in);

    private String idNumber, firstName, lastName;
    private String college, program, major;
    public String term, year;
    
    StudentInfo (String c, String p, String t, String term, String year){
        college = c;
        program = p;
        major = t;
        this.term = term;
        this.year = year;
    }
    
//    void setCollegeTrack(String tracks){
//        track = tracks;
//        tracks = "BSCS";
//    }
    
    String getIdNumber(){
     return idNumber;
    }
    
    void setIdNumber(String num){
        idNumber = num;
    }
    
    String getFirstName(){
     return firstName;
    }
    
    void setFirstName(String name){
     firstName = name;
    }
    
    String getLastName(){
     return lastName;
    }
    
    void setLastName(String name){
     lastName = name;
    }
    
    void printInfo(){
        System.out.println("University of the Cordilleras");
        System.out.println(college);
        System.out.println(term + ", " + year);
        System.out.println("Student Info:");
        System.out.println("ID NUMBER: " + idNumber);
        System.out.println("NAME: " + lastName + ", " + firstName);
        System.out.println("Academic Program: " + program + " " + major);





    }
}
