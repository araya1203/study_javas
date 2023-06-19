import inheritances.ObjectInheritances;
import vehicles.Bicycle;

public class Inheritances {
    public static void main(String[] args) {
        try {
            //ObjectInheritances objectInheritances = new ObjectInheritances();  
            Bicycle bicycle = new Bicycle(5500, "blue"); //만들어준 파라미터를 바로 사용하고 싶을때의 인스턴스화
            System.out.println(bicycle.toString()); //toString을 활용하여 값이 제대로 들어갔는지 확인
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
    

