public class MethodsSwitchs {

    public String today(int day){
        String str = "";
        try {
            switch (day) {
              case 1:
                str = "Monday";
                break;
              case 2:
                str = "Tuesday";
                break;
              case 3:
                str = "Wednesday";
                break;
              case 4:
                str = "Thursday";
                // break;  
            }  
           
           }catch(Exception e) {
   
           }
          return str;
        }
    

    public static void main(String[] args) {
    
        try {
           int day = 4;
           String str = "";
           
           MethodsSwitchs methodsSwitchs = new MethodsSwitchs();
           String returnResult= methodsSwitchs.today(day);
            System.out.println(returnResult);
            
            
        } catch (Exception e) {
            // TODO: handle exception
        } 
        //  코드를 잘 짜려면 상수보다는 변수를 이용하여 코드 짜기
    
       // return 0; 
    
    }
}