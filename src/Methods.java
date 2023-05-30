public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // 두 값을 빼는 기능 
 

    public int minus(int first, int second) {
        int result = 0;
        try {
            result = first - second;
        } catch (Exception e) {
            // 예외 처리 코드
        }
        return result;
    }

    public int add(int first, int second) {
        int result = 0;
        try {
            result = first + second;
        } catch (Exception e) {
            // 예외 처리 코드
        }
        return result;
    }

    public static void main(String[] args) {
        Methods methods = new Methods(); // 인스턴스는 1회 
        int first = 2;
        int second = 1;
        int result = methods.add(first, second);  // 덧셈 수행
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);

        result = methods.minus(result, second); // 뺄셈 수행
        
        System.out.println(result); // 결과값 출력
        
        try {
           
    } catch (Exception e) {
        // TODO: handle exception
    }
    // return 0;
  
    }

}