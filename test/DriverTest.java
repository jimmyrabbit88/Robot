import org.junit.Test;
import static org.junit.Assert.*;

public class DriverTest {

    Driver d1 = new Driver("jason", 1234);

    @Test
    public void TestGetName(){
        assertEquals("jason", d1.getDriverName());

    }

    @Test
    public void TestGetDriverNumber(){
        assertEquals(1234, d1.getDriverNum());
    }

    @Test (expected = IllegalArgumentException.class)
    public void TestSetNameFail(){
        Driver F1 = new Driver("", 1234);
    }

    @Test (expected = IllegalArgumentException.class)
    public void TestSetDriverNumFail(){
        Driver F1 = new Driver("jason", 12);
    }
}
