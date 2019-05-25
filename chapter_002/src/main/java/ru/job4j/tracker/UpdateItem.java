package ru.job4j.tracker;

public class UpdateItem extends BaseAction {

    public UpdateItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("Edit items");
        String id  = input.ask("Please, provide item ID: ");
        String name = input.ask("Please, provide item name: ");
        String desc = input.ask("Please, provide item description: ");
        Item item = new Item(name, desc);
        tracker.replace(id, item);
    }
}
