package az.edu.turing.module3.lessonFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter=new FileWriter("text.txt",true);
        fileWriter.write(" haralardasan");
        fileWriter.close();

        FileReader fileReader=new FileReader("text.txt");

        BufferedReader bf = new  BufferedReader(fileReader);
        System.out.println(bf.readLine());

    }
}
