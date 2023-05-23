public class MakingGamebyOneHand {
    public static void main(String[] args)  {
        String A = "1" ;
        String B = "";
        String C = "2";

        B = C;
        C = A;
        A = B;

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
       
    }    
    
}


