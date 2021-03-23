import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        User user1 = new User(1, "vasya", 22, Gender.MAN);
        User user2 = new User(2, "anya", 21, Gender.WOMAN);
        User user3 = new User(3, "nastya", 19, Gender.WOMAN);
        User user4 = new User(4, "petya", 25, Gender.MAN);
        User user5 = new User(5, "olya", 20, Gender.WOMAN);
        User user6 = new User(6, "oleg", 18, Gender.MAN);
        User user7 = new User(7, "roman", 23, Gender.MAN);
        User user8 = new User(8, "igor", 31, Gender.MAN);
        User user9 = new User(9, "lilya", 15, Gender.WOMAN);
        User user10 = new User(10, "kyrylo", 26, Gender.MAN);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        List<User> userListId = users.stream()
                .filter(user -> user.getId() % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(userListId);

        List<User> collect = users.stream()
                .filter(user -> user.getName().length() > 5)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<User> listWoman = users.stream()
                .filter(user -> user.getGender().gender == "famale")
                .collect(Collectors.toList());
        System.out.println(listWoman);
    }
}
