public class MethodBasics {
// <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // body
    // }
    //  x에 +1
    public int F(int x) 
    {
        int result = x + 1;
        // body
        return result;
    }

    public int Y(int y) 
    {
        int result = y + 1;
        // body
        return result;
    }


    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            // y = y + 1; // 변수에 + 1
            // y = F(x);
            MethodBasics MethodBasics = new MethodBasics();
            // main 메소드 내에서 MethodBaciscs 클래스의 인스턴스를 생성하여 해당 인스턴스를 통해 F(int) 메소드를 호출
            y = MethodBasics .F(x);

            
            y = MethodBasics .Y(x);

        } catch (Exception e) {
            // TODO: handle exception

        }
        System.out.println();

        // return 0;
    }
}