package az.edu.turing.module2.practice;

public class PersonApp {
    public static void main(String[] args){
        Student student1 =new Student(1,"Tom",20,75.5);
        Student student2 =new Student(1,"Jacl",21,45.5);
        Teacher teacher1= new Teacher(3,"HOHO",98,"java");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(teacher1);

    }
}
