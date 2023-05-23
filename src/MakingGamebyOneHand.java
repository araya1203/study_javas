public class MakingGamebyOneHand {
    public static void main(String[] args)  {
        int variable1 = 1;
        int variable2 = 2;
        int temp;

        System.out.println("변수 1: " + variable1);
        System.out.println("변수 2: " + variable2);

        // 변수 교차로 값 입력
        temp = variable1;
        variable1 = variable2;
        variable2 = temp;

        System.out.println("값 교차 후");
        System.out.println("변수 1: " + variable1);
        System.out.println("변수 2: " + variable2);
       
    }    
    
}


