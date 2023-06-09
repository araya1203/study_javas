public class Arrays {
 public static void main(String[] args) {
    // String[][] numbers는 2차원 문자열 배열을 선언하는 방법
   String[][] numbers ={
                        {"10","20","30","40"}, 
                        {"50","60","70"}
                       };
  
     for (int second = 0; second < numbers.length; second++){
        for (int third = 0; third < numbers[second].length; third++) {
        //  for문법 (초기화식;조건식;증감식)
        
        System.out.print(numbers[second][third]+ ",");
        } 
        System.out.println();           
    }  
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
     System.out.println(cars.length);  
     for (int first=0; first < cars.length; first++){
     System.out.print(cars[first]+",");
     }
       
    // exel로 생각해볼 때 0,1,2,3 이라 int i 값 0
    // cars.length와 같이 변수를 사용할 때 유동성
    System.out.println(); 
    //return 0;
    }
}



