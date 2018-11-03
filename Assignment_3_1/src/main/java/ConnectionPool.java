
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnectionPool {

    private static final String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "vgaddam";
    private static final String password = "";
    private final static int MAX_POOL_SIZE = 5;
    private static int usedConnections =0;
    private static final int ZERO=0;

    static ArrayList<Connection> connectionPool = new ArrayList<Connection>();
    static ArrayList<Connection> usedPoolOfConnections = new ArrayList<Connection>();


    private ConnectionPool() {}

    public static void intialisePool()  {
        Connection connection;
        for(int i=ZERO;i<MAX_POOL_SIZE;i++) {
            connection = DbConnection.getConnection();
            if(connection!=null) {
                connectionPool.add(connection);
                usedPoolOfConnections.add(connection);
            }
        }
    }

    public static Connection getConnection() throws PoolLimitException {

        if (checkAvailableConnection()) {
            usedConnections++;
            return connectionPool.remove(0);
        }
        throw new PoolLimitException("Sorry Pool Limit is Reached.");
    }

    public static void closeConnection(Connection connection) {
        connectionPool.add(connection);
        --usedConnections;
    }

    private static boolean checkAvailableConnection() {
        return usedConnections<MAX_POOL_SIZE;
    }

    private static void closeAllUsedConnections() {
        for(int i=ZERO;i<usedPoolOfConnections.size();i++) {
            usedPoolOfConnections.remove(i);
        }
    }


}
