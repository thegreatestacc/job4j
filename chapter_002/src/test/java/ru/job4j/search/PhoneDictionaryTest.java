package ru.job4j.search;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Vladimir", "Solovyov", "12345", "Zheleznodorozhny")
        );
        phones.add(
                new Person("Oleg", "Petrov", "54321", "Moscow")
        );
        var persons = phones.find("Vlad");
        var persons2 = phones.find("Oleg");
        assertThat(persons.iterator().next().getSurname(), is("Solovyov"));
        assertThat(persons2.iterator().next().getSurname(), is("Petrov"));
    }

    @Test
    public void whenNewFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
