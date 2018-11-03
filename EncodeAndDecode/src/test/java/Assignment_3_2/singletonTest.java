package Assignment_3_2;

import org.junit.Assert;
import org.junit.Test;

public class singletonTest {
    @Test
    public void shouldTestSingleton() {

        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        Assert.assertEquals(instance1, instance2);
    }
    @Test
    public void shouldTestSameReference() {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        Assert.assertEquals(instance1.hashCode(),instance2.hashCode());
    }
}
