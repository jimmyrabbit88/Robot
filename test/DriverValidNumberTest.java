import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DriverValidNumberTest {
    private final ByteArrayOutputStream OUTC = new ByteArrayOutputStream();
    private final ByteArrayOutputStream ERRC = new ByteArrayOutputStream();

    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(OUTC));
        System.setErr(new PrintStream(ERRC));
    }

    @Test
    public void testValidAgeMsg() throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Driver d1 = new Driver("jason", 3999);
        d1.checkNumberValid();
        baos.flush();
        //not finished from here
        //String whatWasPrinted
    }

}