package ru.job4j.tracker;

public class FindItemsByName implements UserAction {

    int key;
    String command;

    public FindItemsByName(int key, String command) {
        this.key = key;
        this.command = command;
    }

    @Override
    public int key() {
        return 6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find by name item. ------------");
        String name = input.ask("Pleas input name item.");
        Item[] items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println("Item find");
            item.toString();
        }

    }

    @Override
    public String info() {
        return "Find by name item";
    }
}
