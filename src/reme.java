import java.util.ArrayList;
import java.util.HashMap;

public class reme {


       public static void main(String[] args) {
        // try catch문 사용
        try {
             ArrayList<String> patient_information = new ArrayList<String>();;
            patient_information .add("NAME");
            patient_information.add("AGE");
            patient_information.add("HEIGHT");
            patient_information.add("BLOODPRESSURE");
            patient_information .add("MAINTENANCELPLAN");
            patient_information .add("GENDER_CODE_ID");
            patient_information .add("RESULT_CODE_ID");
            patient_information .add("PATIENT_INFORMATION_ID");
            patient_information .add("WEIGHT");
            patient_information .add("BLOODSUGAR");


            for (String PI : patient_information) {
                System.out.println(patient_information);
            }
             
            //Automobile Company	Vehicle Names
          
            

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // return 0;
    }
    
}
