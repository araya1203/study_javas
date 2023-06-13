package Cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnyStatements {
    public ResultSet selectStatement(Statement statement, String qy) throws SQLException {
        ResultSet resultSet = statement.executeQuery(qy);
        return resultSet;
   }
}
