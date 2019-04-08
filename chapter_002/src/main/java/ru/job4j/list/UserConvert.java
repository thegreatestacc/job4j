package ru.job4j.list;

import java.util.HashMap;
import java.util.List;

/*В классе UserConvert написать метод public HashMap<Integer, User> process(List<User> list) {},
который принимает в себя список пользователей и конвертирует его в Map с ключом Integer id и соответствующим ему User.*/

public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> map = new HashMap<>();
        for (User users : list) {
            map.put(users.getId(),users);
        }
        return map;
    }
}
