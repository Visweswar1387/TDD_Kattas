import com.ProducerConsumer.Main;
import org.junit.Test;

public class ProducerConsumerTest {
    @Test
    public void shouldTestProducerConsumer() throws InterruptedException {
        Main prod = new Main();
        prod.startThread();
    }
}
