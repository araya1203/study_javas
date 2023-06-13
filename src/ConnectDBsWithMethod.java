/*f(x, y) = x+1 * y
x가 숫자가 아닐 수도 있다. 정수외에 무리수, 행렬일 수 있다. language에서 넣을 수 있는 것은 숫자, 문자, funtion 
parameter확장을 이해해야한다. funtion은 그 안에서만 사용할 수 있고 밖에서는 사용할 수 없음. 
어떤 parameter 넣고 어떤 return 값을 받는지 생각하며 java에 맞게 작성한다. 
method는 넣는값과 나오는 값이 정해져 있다. 갯수만 다를 뿐이다.   */
/* method는 먼저 class를 만든다.  */

import java.sql.*;

import Cars.AnyStatements;

public class ConnectDBsWithMethod {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            AnyStatements anyStatements = new AnyStatements();
            ResultSet resultSet = anyStatements.selectStatement(statement,query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }

            // SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = statement.executeQuery(query);
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }

            /*
            INSERT INTO factorys
            (COMPANY_ID, COMPANY) 
            VALUE 
            ('CAR-01', 'AUDI');
            */
            String companyId = "CAR-01";
            String company = "AUDI" ;
            query = "INSERT INTO factorys " +
                    "(COMPANY_ID, COMPANY) " +
                    " VALUE " +
                    "('"+companyId+"', '"+company+"') ";
            
            int count = statement.executeUpdate(query);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
