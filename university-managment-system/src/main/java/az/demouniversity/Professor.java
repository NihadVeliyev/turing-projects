package az.demouniversity;

import java.util.Arrays;
import java.util.Objects;

public class Professor extends Person {
    private String department;
    private String[] subject;

    public Professor(int id, String name, int age, String department, String[] subject) {
        super(id, name, age);
        this.department = department;
        this.subject = subject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }
    private int count;
    public void AddSubject(String subject){
        this.subject[count]=subject;
        count++;


    }
    public String getSubjectList(){
        for(int i=0;i< subject.length;i++){


        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return count == professor.count && Objects.equals(department, professor.department) && Objects.deepEquals(subject, professor.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, Arrays.hashCode(subject), count);
    }

    public


    @Override
    public String toString() {
        return super.toString() +
                "department='" + department + '\'' +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }

}
