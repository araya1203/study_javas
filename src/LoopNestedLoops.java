public class LoopNestedLoops {
 public static void main(String[] args) {
    // for (초기화식; 조건식; 증감식) {
    // 반복적으로 실행되는 코드

    for(int first = 1; first < 5; first = first + 1) {
        System.out.println("for "+ first);
        for(int second=1; second <= first; second = second + 1) {
            System.out.print("_?");
         }
         System.out.println(); 
    }
     System.out.println("end"); 
    // reurn 0;

    for(int first = 1; first < 5; first = first + 1) {
      System.out.println("for "+ first);
      for(int second=1; second <= first; second = second + 1) {
        if(second <= first){
            System.out.print("_?");
          } else {
            break;
          }
        } 
       System.out.println(); 
  }
   System.out.println("end"); 
  // reurn 0;
  }
 }



