package az.edu.turing.module2.practice;

public class   Teacher extends Person  {

    private  String subject;

    public Teacher(int id, String name, int age, String subject) {
        super(id, name, age);
        this.subject=subject;
    }
}
}
