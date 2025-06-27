package az.demouniversity;

import java.util.Arrays;
import java.util.Objects;

public class Student extends Person {
    private String major;
    private double gpa;
    private  double[] grades;
    private  Course[] courses;

    public Student(int id, String name, int age,int limit, String major) {
        super(id, name, age);
        this.grades = new double[limit];
        this.courses = new Course[limit];
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Course[] getCourse() {
        return courses;
    }
    private int count ;
    public void enrollCourse(Course course){
        courses[count]=course;
        count++;
    }
    public double calculateStudentGPA(){
        double sum=0;
        for(int i=0;i<grades.length;i++){
            sum+=grades[i];
        }
        return sum/ grades.length;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(major, student.major) && Objects.deepEquals(grades, student.grades) && Objects.deepEquals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), major, Arrays.hashCode(grades), Arrays.hashCode(courses), gpa);
    }


    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", major='" + major + '\'' +
                ", grades=" + Arrays.toString(grades) +
                ", course=" + Arrays.toString(courses) +
                ", gpa=" + gpa +
                '}';
    }

}









