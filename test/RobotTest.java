import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class RobotTest {
    @Rule
            public Timeout globaltimeout = Timeout.millis(2000);

    Robot robot = new Robot("buddy", 4);

    @Test
    public void TestGetName(){
        assertEquals("buddy", robot.getName());
    }

    @Test (expected = IllegalArgumentException.class)
    public void TestSetNameFail(){
        Robot chuck = new Robot("", 2);
    }

    @Test
    public void TestHetAge(){
        assertEquals(4, robot.getAge());
    }

    @Test
    public void TestIsNotWorking(){
        assertFalse(robot.isWorking());
    }

    @Test
    public void TestIsWorking(){
        robot.talkToRobot();
        assertTrue(robot.isWorking());
    }

    @Test
    public void TestGetWorkingMessage(){
        robot.talkToRobot();
        assertEquals("I am in working order", robot.getWorkingMessage());
    }

    @Test(expected = IllegalStateException.class)
    public void TestGetWorkingMessageFail(){
        assertEquals("I am in working order", robot.getWorkingMessage());
    }

    @Test (timeout = 1000)// milliseconds/ 1second
    public void TestWaitTillWorking(){
        robot.waitTillWorking();

    }


}