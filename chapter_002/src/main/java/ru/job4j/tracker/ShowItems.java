package ru.job4j.tracker;

public class ShowItems extends BaseAction {

    public ShowItems(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Show all items. ------------");
        Item [] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
