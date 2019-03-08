package za.ac.cputassignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student stud;
    Student stud2;

    @Before
    public void setUp() throws Exception {

        stud =new Student .Builder()
                          .studentNo(1)
                          .firstName("siphokuhle")
                          .lastName("Tyasi")
                          .build();
        stud2=new Student .Builder()
                          .studentNo(1)
                          .firstName("Siphokuhle")
                          .lastName("Tyasi")
                          .build();


    }

    @Test
    public void getStudentNo() {

        Assert.assertEquals(1,stud.getStudentNo());
    }

    @Test
    public void getFirstName() {
     Assert.assertEquals("tyas",stud.getFirstName());
    }

    @Test
    public void getLastName() {
        Assert.assertEquals("Tyasi",stud.getLastName());
    }

    @Test
    public void objectEquality()
    {
        stud2 =stud;
        Assert.assertEquals(stud2,stud);
    }

}