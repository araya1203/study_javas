public class MakingGamebyOneHand {
    public static void main(String[] args)  {
        int variable1 = 1;
        int variable2 = 2;
        int temp;

        System.out.println("A" + variable1);
        System.out.println("B" + variable2);

      
        temp = variable1;
        variable1 = variable2;
        variable2 = temp;

        System.out.println("temp");
        System.out.println("A " + variable1);
        System.out.println("B" + variable2);
       
    }    
    
}


