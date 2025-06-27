package az.edu.turing.module3.practice;

import java.sql.SQLOutput;
import java.util.function.Consumer;

public class Practice1  {
    public static void main(String[] args) {
        Consumer<Integer> evenOddChecker=(o) ->{
            if(o%2==0){
                System.out.print(o+" is even");
            } else {
                System.out.print(o+" is odd");


            }



        };
        evenOddChecker.accept(10);








    }


}
