
import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {   
       // try catch문 사용
       try {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String answer = "";
        System. out. println("선택에 따라 안내글을 보여드립니다");
        System. out. println("------ 작동 key ------");
        boolean loops = true;
        System.out.println("(E)xit : 종료");
        System.out.println("(P)oll : 설문 시작");
        System.out.println("(S)tatistic : 설문 통계");
        
        while (loops) { 
       
            System.out.print("선택 입력: ");
            answer = myObj.nextLine();
           
            if (answer.equals ("P")) {
                // java에서는 문자로는 == 사용할 수 없음. equals 사용해야함.
                 System.out.println("----- 설문 시작 ------");
                  } else if (answer.equals ("S")) {
                 System.out.println("----- 설문 통계 ------");
                  } else if (answer.equals ("Poll")) {
                 System.out.println("----- 설문 시작 ------");
                  } else{
                 System.out.println("----- 설문 종료 ------");
                  break;
                } 

            }    
       } catch (Exception e) {
           // TODO: handle exception
       } finally{
           // TODO: handle exception
       }
       
       System.out.println();

      // return 0; 
    }
}
