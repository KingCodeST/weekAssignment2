package za.ac.cputassignment3;

import java.util.Objects;

public class Student {



    private int studentNo;
    private String firstName;
    private String lastName;

   private Student(){ }



    /// Director Builder

    public Student(Builder builder)
    {
        this.studentNo =builder.studentNo;
        this.firstName =builder.firstName;
        this.lastName =builder.lastName;

    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    ////////////

    public static class Builder
    {
        private int studentNo;
        private String firstName;
        private String lastName;




        public Builder studentNo(int value)
        {
            this.studentNo =value;
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

        public Student build()
        {
            return  new Student(this);
        }



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Builder builder = (Builder) o;
        return studentNo == builder.studentNo;
    }


    @Override
    public int hashCode() {
        return Objects.hash(studentNo);
    }



}
