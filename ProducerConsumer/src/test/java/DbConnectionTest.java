import com.ProducerConsumer.DbConnection;
import org.junit.Assert;
import org.junit.Test;

public class DbConnectionTest {
    @Test
    public void shouldTestDbConnection() {
        Assert.assertNotEquals(null, DbConnection.getConnection());
    }
}
