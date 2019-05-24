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
}
