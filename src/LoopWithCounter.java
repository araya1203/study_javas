public class LoopWithCounter {

    public static void main(String[] args) {
    
          int A = 5;
          int B = 1;
          int C = 1;
          while ( C < A && B < A) {
            System.out.println(B);
            System.out.println(C);
             B = B + 1 ;
             C = C + 1 ;
          }
            System.out.println(B);
            System.out.println(C);  
        // reurn 0;
    }
    
}
