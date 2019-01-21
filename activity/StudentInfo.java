package cc3.activity;
public class StudentInfo {
    
    private String idNumber, firstName, lastName;
    String college, academicProgram, major;
    
    StudentInfo (String c, String ap, String m) {
        college = c;
        academicProgram = ap;
        major = m;
    }
    
    String getIDNumber() {
        return idNumber;
    }
    
    void setIDNumber(String num) {
        idNumber = num;
    }
    
    String getFirstName() {
        return firstName;
    }
    
    void setFirstName(String name) {
        firstName = name;
    }
    
    String getLastName() {
        return lastName;
    }
    
    void setLastName(String name) {
        lastName = name;
    }
    
    void printInfo() {
        System.out.println("University of the Cordilleras");
        System.out.println("College: " + college);
        System.out.println("Academic Program: " + academicProgram);
        System.out.println("Track: " + major);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Student Name: " + lastName + ", " + firstName);
        System.out.println();
    }
}
