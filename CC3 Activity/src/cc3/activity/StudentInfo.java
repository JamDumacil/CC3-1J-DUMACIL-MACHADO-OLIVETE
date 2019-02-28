package cc3.activity;
public class StudentInfo {
    
    private String idNumber;
    private String firstName;
    private String lastName;
    private String college;
    private String academicProgram;
    private String major;
    
    public String term;
    public String year;
    
    StudentInfo(String c, String p, String t) {
        college = c;
        academicProgram = p;
        major = t;
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
    String getCollege() {
        return college;
    }
    
    void setCollege(String name) {
        college = name;
    }
    String getAcadamicTrack() {
        return academicProgram;
    }
    
    void setAcademicTrack(String name) {
        academicProgram = name;
    }
    
    String getMajor() {
        return major;
    }
    
    void setMajor(String name) {
        major = name;
    }
    
    String getProgram() {
        return academicProgram;
    }
    
    void setProgram(String name) {
        academicProgram = name;
    }
    String getTerm() {
        return term;
    }
    
    void setTerm(String name) {
        term = name;
    }
    String getYear() {
        return year;
    }
    
    void setYear(String name) {
        year = name;
    }
    
    
    void printInfo() {
        System.out.println("University of the Cordilleras");
        System.out.println(college);
        System.out.println(term + ", " +year);
        System.out.println("Student Info: ");
        System.out.println("ID Number: " + idNumber);
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("Academic Program: " + academicProgram + " - "+major);
        System.out.println("");
    }
}
