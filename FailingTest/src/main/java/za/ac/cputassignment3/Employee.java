package za.ac.cputassignment3;



import java.util.Objects;

public class Employee {






    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

//// create private constructor for security

    private Employee()
    {

    }

    /////
    public Employee(Builder builder)
    {
        this.id =builder.id;
        this.firstName =builder.firstName;
        this.lastName =builder.lastName;
        this.age =builder.age;
        this.salary =builder.salary;

    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static class Builder{
        private String id;
        private String firstName;
        private String lastName;
        private int age;
        private double salary;

        public Builder id(String value)
        {
           this.id =value;
           return this;
        }

        public Builder firstName(String value)
        {
            this.firstName =value;
            return this;
        }

        public Builder lastName(String value)
        {
            this.lastName =value;
            return this;
        }

        public Builder age(int value)
        {
            this.age =value;
            return this;
        }
        public Builder salary(double value)
        {
            this.salary =value;
            return this;
        }

        public Employee build()
        {
            return  new Employee();
        }


    }


}
