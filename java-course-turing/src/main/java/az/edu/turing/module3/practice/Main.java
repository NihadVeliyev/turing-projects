package az.edu.turing.module3.practice;

import java.sql.Array;
import java.util.ArrayList;

public class Main<T>{
    public static void main(String[] args) {



        Colorbruh colorbruh = new Colorbruh(new ArrayList<>());


    ArrayList<String> names=new ArrayList<>();
    names.add("a");
        names.add("b");
        names.add("c");
        names.add("a");
        System.out.println(names.get(2));
        names.set(2,"amk");
        System.out.println(names.get(2));
        names.remove(1);
        System.out.println(names);

names.clear();
checkempty(names);



    }
    public static void checkempty(ArrayList<String> name){
        if(name.isEmpty()){
            System.out.println(true);


        }
        else{
            System.out.println(false);
        }

    }

}



