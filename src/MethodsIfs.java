public class MethodsIfs {

    public void checkTimeOfDay(int time) {
        
        if (time < 12) {
            System.out.println("오전입니다.");
        } else if (time < 18) {
            System.out.println("오후입니다.");
        } else {
            System.out.println("밤입니다.");
        }
    }

    public static void main(String[] args) {
        try {
            int time = 15;

            MethodsIfs methodsIfs = new MethodsIfs();
            methodsIfs.checkTimeOfDay(time);
            
            
        } catch (Exception e) {
            // Handle exception here
        }
    }
}