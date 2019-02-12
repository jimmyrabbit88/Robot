import org.junit.Test;
import static org.junit.Assert.*;

public class DriverTest {
    //Test all the positive tests on constructor and each public method

    Driver d1 = new Driver("jason", 1234);

    @Test
    public void TestGetName(){
        assertEquals("jason", d1.getDriverName());
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

    @Test
    public void testToString() {
        String exp = "\nDriver Name: jason\nDriver Number: 1234";
        assertEquals(d1.toString(), exp);
    }

    @Test
    public void testStatus() {
        assertFalse(d1.check_status());
    }

    @Test(timeout = 1000)//milliseconds
    public void testWaitTillBanned() {
        d1.waitTillbanned();
    }
}
