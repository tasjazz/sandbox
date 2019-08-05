package sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

    @Test
    public void testCalcSize(){

        Assert.assertEquals(new Square().calcSquare(5), 25.0);
    }
}
