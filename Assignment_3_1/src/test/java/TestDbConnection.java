import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;

public class TestDbConnection {



    private static Connection connection1;
    private static Connection connection2;
    private static Connection connection3;
    private static Connection connection4;
    private static Connection connection5;

    @BeforeClass
    public static void intialise() throws PoolLimitException {
        ConnectionPool.intialisePool();
        connection1 = ConnectionPool.getConnection();
        connection2 = ConnectionPool.getConnection();
        connection3 = ConnectionPool.getConnection();
        connection4 = ConnectionPool.getConnection();
        connection5 = ConnectionPool.getConnection();

    }

    @Test(expected = PoolLimitException.class)
    public void shouldTestDbConnectionLimitException() throws PoolLimitException {
        Assert.assertEquals("Sorry Pool Limit is Reached.",ConnectionPool.getConnection());
    }

    @Test
    public void shouldTestDbConnectionReuseConnection() throws PoolLimitException {
        ConnectionPool.closeConnection(connection1);
        Assert.assertEquals(connection1,ConnectionPool.getConnection());
    }


}
