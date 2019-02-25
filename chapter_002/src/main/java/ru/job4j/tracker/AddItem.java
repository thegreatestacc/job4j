package ru.job4j.tracker;

public class AddItem extends BaseAction {

    public AddItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Enter name: ");
        String desc = input.ask("Enter description: ");
        Item item = new Item(name, desc);
        tracker.add(item);
        System.out.println("Item id is: " + item.getId());
    }
}
