import org.junit.Test;

public class TestDbConnection {
    @Test
    public void shouldTestDbConnection() {
        DbConnection.getConnection();
        DbConnection.getConnection();
        DbConnection.getConnection();
        DbConnection.getConnection();
        DbConnection.getConnection();
        if(DbConnection.getConnection()==null) {
            System.out.print("Connection Pool is limited.");
        }
    }
}
