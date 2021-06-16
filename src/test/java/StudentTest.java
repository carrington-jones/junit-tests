import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student Carrington;

    @Before
    public void setUp(){
        this.Carrington = new Student(1,"Carrington");
    }

    @Test
    public void testIfStudentCanBeCreated(){
        Student fer = new Student(1L, "fer");
        Student nullStudent = null;
        assertNotNull(fer);
        assertNull(nullStudent);
        assertEquals(1,fer.getId());
    }

    @Test
    public void testGetId(){
        assertEquals(1, Carrington.getId());
        Student craig = new Student(27, "Craig");
        assertEquals(27, craig.getId());
    }

    @Test
    public void testIfFieldsAreSet(){
        Student fer = new Student(1L, "fer");
        assertEquals(1L, fer.getId());
        assertEquals("fer", fer.getName());

        Student rosie = new Student(40L, "Rosie");
        assertEquals(40L, rosie.getId());
        assertEquals("Rosie", rosie.getName());
    }

    @Test
    public void testIfAddGradeWorks(){
        Student fer = new Student(1L, "fer");
        assertEquals(0, fer.getGrades().size());//expected 0 because no grades have been added.
        fer.addGrade(90);
        assertEquals(1, fer.getGrades().size());//expected 1 because only 1 grade has been added.
        fer.addGrade(70);
        assertEquals(2, fer.getGrades().size());//expected 2 becasue only 2 grades have been added.
    }

    @Test
    public void testIfGetGradesWorks(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(90);
        fer.addGrade(70);
        assertSame(90, fer.getGrades().get(0));
        assertSame(70, fer.getGrades().get(1));
    }

    @Test
    public void testIfGetAVGWorks(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(90);
        fer.addGrade(70); // 160 / 2 = 80
        assertEquals(80, fer.getGradeAverage(), 0);
        fer.addGrade(50); // 210 / 3 = 70
        assertEquals(70, fer.getGradeAverage(), 0);
    }

}
