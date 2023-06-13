import java.util.Scanner;

public class CarsWithDB {
     public static void main(String[] args) {
         // try catch문 사용
        try {
            Scanner scanner  = new Scanner(System.in);
            
            String workkey = "P";
            while(!workkey.equals("E")){
            System.out.print("선택입력 :");
            workkey = scanner.nextLine();
            }
        } catch (Exception e) {
            // TODO: handle exception

        System.out.println(e.getMessage());

        } 
        
        System.out.println();

       // return 0; 
    }
    
}
