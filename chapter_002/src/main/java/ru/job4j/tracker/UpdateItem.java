package ru.job4j.tracker;

public class UpdateItem implements UserAction{
    int key;
    String command;

    public UpdateItem(int key, String command) {
        this.key = key;
        this.command = command;
    }

    @Override
    public int key() {
        return 3;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("Edit items");
        String id  = input.ask("Please, provide item ID: ");
        String name = input.ask("Please, provide item name: ");
        String desc = input.ask("Please, provide item description: ");
        Item item = new Item(name, desc);
        boolean trackEdit = tracker.replace(id, item);
        if(trackEdit) {
            System.out.println("Item edit");
            System.out.println(item);
        } else {
            System.out.println("Item not edit");
        }
    }

    @Override
    public String info() {
        return "Edit item - 2.";
    }
}
