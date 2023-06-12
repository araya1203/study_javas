package Cars;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class FactoryDMLs {
    public ResultSet SelectStatements( Statement statement,String query) throws SQLException {
    ResultSet resultSet = statement.executeQuery(query);
    return resultSet;

    }
}
