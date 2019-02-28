package cc3.activity;
public class CC3Activity {

    public static void main(String[] args) {
        
    
        StudentInfo studentInfo = new StudentInfo("CITCS", "BSCS", "Mobile Technology");
        studentInfo.setTerm ("2nd Term");
        studentInfo.setYear("S.Y. 2018-2019");
        studentInfo.setIDNumber("18-5020-603");
        studentInfo.setFirstName("Valter");
        studentInfo.setLastName("Machado");
        studentInfo.printInfo();
        
        StudentInfo studentInfo2 = new StudentInfo("CITCS", "BSCS", "Digital Arts & Animation");
        studentInfo2.setCollege("CITCS");
        studentInfo2.setTerm ("2nd Term");
         studentInfo2.setYear("S.Y. 2018-2019");
        studentInfo2.setIDNumber("18-4633-619");
        studentInfo2.setFirstName("Wyli");
        studentInfo2.setLastName("Olivete");
        studentInfo2.setAcademicTrack("BSCS");
        studentInfo2.setMajor("Digital Arts and Animation");
        studentInfo2.printInfo();
        
        StudentInfo studentInfo3 = new StudentInfo("CITCS", "BSCS", "Mobile Technology");
        studentInfo3.setCollege("CITCS");
        studentInfo3.setTerm ("2nd Term");
         studentInfo3.setYear("S.Y. 2018-2019");
        studentInfo3.setIDNumber("18-1023-446");
        studentInfo3.setFirstName("Jamellah");
        studentInfo3.setLastName("Dumacil");
        studentInfo3.setAcademicTrack("BSCS");
        studentInfo3.setMajor("Digital Arts and Animation");
        studentInfo3.printInfo();
    }
    
}