import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class RobotParamTest {
    private String exp;
    private int testAge;

    public RobotParamTest(String exp, int testAge){
        this.testAge = testAge;
        this.exp = exp;
    }

    @Parameterized.Parameters (name="{index}: checkAge({1})={0}")
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][]{
                {"Age OK", 10},
                {"Age OK", 20},
                {"Too old", 30},
        });

    }
        @Test
        public void testcheckageAll () {
            Robot robot = new Robot("buddy", testAge);
            assertEquals(exp, robot.checkAge());

        }
    }

