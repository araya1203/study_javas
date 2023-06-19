import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.Car;
import vehicles.MountainBike;
import vehicles.RoadCycle;

public class Inheritances {
    public static void main(String[] args) {
        try {
            //object 확인
            //ObjectInheritances objectInheritances = new ObjectInheritances();  
           
            // 상속할 class 생성
            // Bicycle bicycle = new Bicycle(5500, "blue"); //만들어준 파라미터를 바로 사용하고 싶을때의 인스턴스화
            //System.out.println(bicycle.toString()); //toString을 활용하여 값이 제대로 들어갔는지 확인
            
            // 상속해 활용
            //MountainBike mountainBike = new MountainBike();
            
            //int price;
            //String color;
            //int seatHight;
            //MountainBike mountainBike = new MountainBike(6200, "yellow", 5);
            
           // RoadCycle roadcycle = new RoadCycle(200000, "Blue", "Super-Fast Bike");
           // System.out.println(roadcycle.toString());
            
           
           Car car = new Car();
           car.speedUp(1);
           car.speedDown(2);
           System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
    

