package az.edu.turing.module3.practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  B = scanner.nextInt();
        int H = scanner.nextInt();
        boolean flag;

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;

        if(flag){
            int area=B*H;
            System.out.print(area);
    }
}}}
