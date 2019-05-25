package ru.job4j.tracker;
/**
В классе SortUser написать метод public Set<User> sort (List<User>), который будет возвращать
TreeSet пользователей, отсортированных по возрасту в порядке возрастания.
*/
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser  {
    Set<User> treeSe;

    public Set<User> sort(List<User> listUser) {

        return new TreeSet<>(listUser);
    }

    public List<User> sortNameLength(List<User> listUser) {
        listUser.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        return listUser;
    }

    public List<User> sortByAllFields(List<User> listUser) {
        listUser.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int result = o1.getName().compareTo(o2.getName());
                if (result == 0) {
                    result = Integer.compare(o1.age, o2.age);
                }
                return result;
            }
        });
        return listUser;
    }
}