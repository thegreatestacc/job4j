package ru.job4j.tracker;

import java.util.List;

public class FindItemsByName extends BaseAction {

    public FindItemsByName(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find by name item. ------------");
        String name = input.ask("Pleas input name item.");
        List<Item> items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println("Item find: " + item);
        }
    }
}
