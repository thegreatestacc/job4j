package ru.job4j.tracker;

public class AddItem implements UserAction {

    int key;
    String command;

    public AddItem(int key, String command) {
        this.key = key;
        this.command = command;
    }

    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Adding new item --------------");
        String name = input.ask("Please, provide item name:");
        String desc = input.ask("Please, provide item description:");
        Item item = new Item(name, desc);
        tracker.add(item);
        System.out.println("------------ New Item with Id : " + item.getId());
        System.out.println("------------ New Item with Name : " + item.getName());
        System.out.println("------------ New Item with Description : " + item.getDesk());
    }

    @Override
    public String info() {
        return "Add new Item.";
    }
}
