package ru.job4j.tracker;

public class FindItemById extends BaseAction {

    public FindItemById(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find by ID item. ------------");
        String id = input.ask("Please provide ID item.");
        Item item = tracker.findById(id);
        tracker.findById(item.getId());
        System.out.println("Item find: " + item);
    }
}
