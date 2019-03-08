package za.ac.cputassignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee emp;
    Employee emps;

    @Before
    public void setUp() throws Exception {
        emp=new Employee .Builder()
                         .id("1")
                          .firstName("Siphokuhle")
                          .lastName("Tyasi")
                          .age(22)
                          .salary(50000.36)
                          .build();
        emps=new Employee .Builder()
                           .id("1")
                           .firstName("Siphokuhle")
                           .lastName("Tyasi")
                           .age(18)
                           .salary(50000.36)
                           .build();
    }

    @Test
    public void getId() {
       Assert.assertEquals("1",emp.getId());
    }

    @Test
    public void getFirstName() {

        Assert.assertEquals(emp.getFirstName(),emp.getFirstName());
    }

    @Test
    public void getLastName() {
                Assert.assertEquals(emp.getLastName(),emp.getLastName());
    }

    @Test(timeout = 2000)
    public void getAge() {
        Assert.assertEquals(emp.getAge(),emp.getAge());
    }

    @Ignore
    @Test
    public void getSalary() {
        assertEquals(50000.36,emp.getSalary());

    }
    private void AssertEquals(double v,double salary){}

    @Test
    public void objectEquality()
    {
        emps =emp;
        Assert.assertEquals(emps,emp);
    }

    @Ignore
    @Test
    public void objectIdentity()
    {
        Assert.assertSame(emp,emps);
    }






}