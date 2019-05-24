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
    Set<User> treeSet = new TreeSet<>();

    public Set<User> sort(List<User> listUser) {
        listUser.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.age, o2.age);
            }
        });
        return treeSet;
    }
}
