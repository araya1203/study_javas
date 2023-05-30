public class MethodBasics {
// <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // body
    // }
    // x에 +1을 한 값을 반환하는 메서드 F
    public int F(int x)  // x = 4
    {
        int result = x + 1;
        // body
        return result;
    }

    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            // y = F(x);
            MethodBasics MethodBasics = new MethodBasics();
            // MethodBaciscs 클래스의 인스턴스를 생성하는 부분
            // 자바에서 클래스를 사용하기 위해서는 해당 클래스의 인스턴스를 생성해야 함.
            // 클래스는 객체를 생성하기 위한 템플릿이며, 인스턴스는 그 템플릿을 기반으로 실제로 메모리에 할당된 객체를 의미합니다.
            // new MethodBasics()는 MethodBasics 클래스의 인스턴스를 생성하는 표현식
            // 이를 methodBasics_first라는 변수에 할당함으로써 해당 인스턴스를 참조할 수 있습니다.
            // 이렇게 인스턴스를 생성하고 참조하는 이유는, 클래스의 멤버인 메서드나 변수를 사용하기 위해서입니다
            // MethodBasics 클래스의 인스턴스를 생성하여 methodBasics_first 변수에 할당하는 것으로, 해당 인스턴스를 통해 클래스 내의 멤버에 접근하고 사용할 수 있게 됩니다.
            y = MethodBasics .F(x);

            y = y + 1; // 변수에 + 1
            MethodBasics methodBasics_first = new MethodBasics();
            y = methodBasics_first.F(y); // F(0) 
            y = methodBasics_first.F(y); // F(0)   

        } catch (Exception e) {
            // TODO: handle exception

        }
        System.out.println();

        // return 0;
    }
}


//  MethodBasics라는 클래스를 정의, 그 안에 F라는 메서드를 포함

// F 메서드는 int 타입의 인자 x를 받아서 x+1의 결과를 반환. 따라서 y = methodBasics.F(x); 코드에서 x 값인 4를 F 메서드에 전달하고, 반환된 결과인 5를 y 변수에 저장합니다.

// 그 후에는 y에 1을 더하고, 다시 methodBasics_first.F(y) 메서드를 호출하여 결과를 y에 저장합니다.

// 코드의 나머지 부분은 예외 처리와 System.out.println();을 통한 결과 출력 등이 포함되어 있습니다.