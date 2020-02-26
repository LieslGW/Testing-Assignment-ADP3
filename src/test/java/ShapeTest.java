import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {

    private Shape s1 = new Shape("Rectangle");
    private Shape s2 = new Shape("Triangle");
    private Shape s3 = new Shape("Square");
    private Shape s4 = new Shape("Rectangle");
    private Shape s5 = new Shape("Circle");

    @Test // Testing Object Identity
    public void getName() throws Exception{
        // if (s1 name == s4 name)
        assertSame(s1.getName(), s4.getName()); // will pass

    }

    @Test // Testing Object equality
    public void getSides() throws Exception{

        s1.setSides();
        s3.setSides();

        // sides both = 4
        assertEquals(s1.getSides(), s3.getSides()); // will pass
    }

    @Test (timeout = 1000)// Testing Object Identity with added timeout
    public void sidesID() throws Exception{
        s2.setSides();
        s3.setSides();

        //if(s2 sides != s3 sides)
        assertNotSame(s2.getSides(),s3.getSides()); // will pass
    }

    @Test (expected = IllegalStateException.class) //Testing Fail Test
    public void zeroSides() throws Exception{
        s5.setSides();
        s5.circle();
    }

    @Ignore("Adding Disable Test") //Added the Disable Test
    @Test
    public void angles() throws Exception{
        s1.setSides();

        String msg = s1.angleMessage();
        assertEquals("This shape has right angles", msg);

    }





}