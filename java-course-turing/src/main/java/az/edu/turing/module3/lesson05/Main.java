package az.edu.turing.module3.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User user1=new User(1,"Nihad");
        User user2=new User(2,"Nigga");
        User user3=new User(3,"Nigger");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        HashMap<Integer,String> hashMap=new HashMap<>();


        userList.stream().forEach(user -> hashMap.put(user.getId(), user.getName()));

                hashMap.forEach((key, value) -> System.out.println(key  + value));


                Map<Integer, String> map = userList.stream()
                        .collect(Collectors.toMap(User::getId, User::getName));


                map.forEach((key, value) -> System.out.println(key + value));



    }
}




