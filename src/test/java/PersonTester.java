import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PersonTester {

    private ArrayList<Person> people;

    private String expected;

    @Before
    public void setUp(){
        this.people = new ArrayList<>();
        people.add(new Person("Joe", true));
        people.add(new Person("Carrington", false));
        Person dave = new Person("Dave", true);
        people.add(dave);
        people.add(dave);
        people.add(new Person("Dave", true));
    }



    @Test
    public void testPerson() {
        assertEquals("Dave", this.people.get(2).getName());
        assertSame(this.people.get(2), this.people.get(3));

    }

    @Test
    public void arrayTest() {
        int[] arrayOfInts = {1, 2, 3, 4};
        int[] yetMoreInts = {1, 2, 3, 4};

//        assertEquals(arrayOfInts, yetMoreInts); //This fails because it is checking the object in memory. it checks if they are SAME array not same in value.
        assertArrayEquals(arrayOfInts, yetMoreInts); //This one does pass. This runs a loop and checks elements in the array to make sure they are equal. Must be of same data type to pass as well.
    }

    @Test
    public void testForCool() {
        assertTrue(this.people.get(0).isCool());
        assertTrue("Joe is super cool.", this.people.get(0).isCool());
        assertFalse("David has never been cool.", this.people.get(1).isCool());
    }
}
