import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class RobotParamCostTest {
    private double exp;
    private int age;


    public RobotParamCostTest(double exp, int age){
        this.age=age;
        this.exp=exp;
    }

    @Parameterized.Parameters (name="{index}:checkCost({1}) = {0}")
    public static Collection<Object[]> getTestParameters(){
        return Arrays.asList(new Object[][]{
            {10000.00, 3},
            {10000.00, 5},
            {7500.00, 6},
            {7500.00, 8},
            {7500.00, 10},
            {5000.00, 11},
            {5000.00, 15},
        });
    }

    @Test
    public void testCheckCost(){
        Robot robot = new Robot("tom", age);
        assertEquals(exp, robot.checkCost(), 0.0);
    }

}