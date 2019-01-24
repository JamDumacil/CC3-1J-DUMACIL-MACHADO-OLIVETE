
package cc3activity;

public class CC3activity {

   
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
        
     StudentInfo studentInfo = new StudentInfo("CITCS", "BSCS", "Mobile Technology", "2nd term", "S.Y. 2018-2019");
     StudentInfo studentInfo2 = new StudentInfo("CITCS", "BSCS", "Digital Arts & Animation", "2nd term", "S.Y. 2018-2019");
     StudentInfo studentInfo3 = new StudentInfo("CITCS", "BSCS", "Digital Arts & Animation", "2nd term", "S.Y. 2018-2019");

     studentInfo.setIdNumber("18-4633-619");
     studentInfo.setFirstName("Valter");
     studentInfo.setLastName("Machado");
     studentInfo.printInfo();
     System.out.println();
     
     studentInfo.setIdNumber("18-5020-603");
     studentInfo.setFirstName("Olivete");
     studentInfo.setLastName("Wyli");
     studentInfo.printInfo();
     System.out.println();
     
     studentInfo.setIdNumber("18-1023-446");
     studentInfo.setFirstName("Jamellah");
     studentInfo.setLastName("Dumacil");
     studentInfo.printInfo();
        
        
        
    }
    
}
