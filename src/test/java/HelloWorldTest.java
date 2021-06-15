import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HelloWorldTest {


    @Test(expected = IllegalArgumentException.class)
    public void testIfHelloWorldWorks(){ //All different test methods are "public void"
        String expectedCarrington = "Hello, Carrington";

        assertEquals(expectedCarrington, HelloWorld.hello("Carrington"));
        assertNotEquals(null, HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello(null));
//        assertEquals(this.expected,HelloWorld.hello());

    }
}
