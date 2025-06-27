package az.edu.turing.module3.practice;

import java.util.ArrayList;

public class Colorbruh {
    private final ArrayList<String> color;

    public Colorbruh(ArrayList<String> color) {
        this.color = color;
        this.color.add("Red");
        this.color.add("Blue");
        this.color.add("Yellow");
    }

    public void printit(){
        System.out.print(color);
    }

}
