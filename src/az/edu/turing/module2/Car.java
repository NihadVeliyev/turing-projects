package az.edu.turing.module2;

import org.w3c.dom.ls.LSOutput;

public class Car {
    String brand;
    private int year;
           private int speed;

    public Car(int speed, int year, String brand) {
        setSpeed(speed );
        setYear(year);
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<2025&&year>1886){
        this.year = year;}
        else{
                System.out.print("Wrong year ");
            }


    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed>=0){

        this.speed = speed;}
        else{
            System.out.print("Speed cant be negative");

            }
    }
    void ShowInfo(){
        System.out.print(speed+year+brand);
    }
}
