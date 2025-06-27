package az.edu.turing.module3.practice;

import java.util.function.Supplier;
import java.time.LocalDateTime;

public class DemoInterface implements Supplier {
    public static void main(String[] args) {

        Supplier<String> datetime = () -> {
            return LocalDateTime.now().toString();

        };

        String currentDateTime = datetime.get();
        System.out.println(currentDateTime);




    }

    @Override
    public Object get() {
        return null;
    }
}
