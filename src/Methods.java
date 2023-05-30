public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // 두 값을 빼는 기능 
    private int result = 2; // 초기 값은 2로 설정

    public int minus(int first, int second) {
       
        try {
            result = first - second;
        } catch (Exception e) {
            // 예외 처리 코드
        }
        return result;
    }

    public int add(int first, int second) {
        
        try {
            result = first + second;
        } catch (Exception e) {
            // 예외 처리 코드
        }
        return result;
    }

    public static void main(String[] args) {

        int first = 8;
        int second = 9;
        Methods methods = new Methods(); // 인스턴스는 1회 생성
        int result = methods.add(first, second ); // 덧셈 수행
        result = methods.minus(result, 4 ); // 뺄셈 수행
   
        try {
            System.out.println(result); // 결과값 출력
    } catch (Exception e) {
        // TODO: handle exception
    }
    // return 0;
  
    }

}