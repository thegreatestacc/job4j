package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        Predicate<Person> byName = (person) -> person.getName().contains(key);
        Predicate<Person> bySurName = (person) -> person.getSurname().contains(key);
        Predicate<Person> byPhone = (person) -> person.getPhone().contains(key);
        Predicate<Person> byAddress = (person) -> person.getAddress().contains(key);

        Predicate<Person> combine = byName.or(bySurName).or(byPhone).or(byAddress);

        persons.stream()
                .filter(combine)
                .collect(Collectors.toList());

        return persons;
    }
}
