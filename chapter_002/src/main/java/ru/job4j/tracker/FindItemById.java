package ru.job4j.tracker;

public class FindItemById implements UserAction {

    int key;
    String command;

    public FindItemById(int key, String command) {
        this.key = key;
        this.command = command;
    }

    @Override
    public int key() {
        return 5;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find by ID item. ------------");
        String id = input.ask("Please provide ID item.");
        Item item = tracker.findById(id);
        tracker.findById(item.getId());
        System.out.println("Item find");
        System.out.println(item);
    }

    @Override
    public String info() {
        return "Find by ID item - 4.";
    }
}
