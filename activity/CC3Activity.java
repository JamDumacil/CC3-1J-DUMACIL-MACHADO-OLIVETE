package cc3.activity;
public class CC3Activity {

    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo("CITCS", "BSCS", "Digital Arts & Animation");
        StudentInfo studentInfo2 = new StudentInfo("CITCS", "BSCS", "Digital Arts & Animation");
        StudentInfo studentInfo3 = new StudentInfo("CITCS", "BSCS", "Digital Arts & Animation");
        
        studentInfo.setIDNumber("18-5020-603");
        studentInfo.setFirstName("Valter");
        studentInfo.setLastName("Machado");
        studentInfo.printInfo();
        
        studentInfo2.setIDNumber("18-4633-619");
        studentInfo2.setFirstName("Wyli");
        studentInfo2.setLastName("Olivete");
        studentInfo2.printInfo();
        
        studentInfo3.setIDNumber("18-1023-446");
        studentInfo3.setFirstName("Jamellah");
        studentInfo3.setLastName("Dumacil");
        studentInfo3.printInfo();
    }
    
}