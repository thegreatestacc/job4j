package ru.job4j.tracker;

public class ShowItems implements UserAction {

    int key;
    String command;

    public ShowItems(int key, String command) {
        this.key = key;
        this.command = command;
    }

    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Show all items. ------------");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }

    @Override
    public String info() {
        return "Show all items.";
    }
}
