public class Arrays {
 public static void main(String[] args) {
    // String[][] numbers는 2차원 문자열 배열을 선언하는 방법
   String[][] numbers ={
                        {"10","20","30","40"}, 
                        {"50","60","70"}
                       };
   //String은 funtion []은 묶음 수 numbers는 변수 
  // {선언된 배열은 2개의 행과 각 행마다 4개와 3개의 열} 
 // 중괄호로 묶여 있으며, 각 행의 요소는 쉼표로 구분
//  2차원 배열에서 요소에 접근하기 위해서는 두 개의 인덱스를 사용
// ex) String element = numbers[0][1];  // "20"을 가져옴
// 위의 코드에서 numbers[0]은 첫 번째 행을 나타내고, [1]은 해당 행의 두 번째 열을 나타냅니다. 따라서 element 변수에는 "20"이 저장
     for (int second = 0; second < numbers.length; second++){
        for (int third = 0; third < numbers[second].length; third++) {
        //  for문법 (초기화식;조건식;증감식)
        //  numbers.length는 {"10","20","30","40"}, numbers.length는 {"50","60","70"}
        //  numbers[second].length는 "10","20","30","40","50","60","70"
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



