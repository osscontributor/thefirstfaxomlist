package thefirstfaxomlist;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        User user = new User("name","username",19,"password" );
        users.add(user);
        System.out.println("There are " + users.size() + " users in the system.");
    }
}
