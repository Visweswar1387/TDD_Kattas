import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "vgaddam";
    private static final String password = "";
    private final static int MAX_POOL_SIZE = 5;
    private static int usedConnections = 0;
    private static Connection connection;

    private DbConnection() {
    }

    public static Connection getConnection()  {
        try {
            if (MAX_POOL_SIZE > usedConnections) {
                connection = DriverManager.getConnection(dbUrl, user, password);
                usedConnections++;
            }
            else {
                connection=null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
