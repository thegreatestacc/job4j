package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    int key;
    String command;

    public DeleteItem(int key, String command) {
        this.key = key;
        this.command = command;
    }

    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Deleted item. ------------");
        String id = input.ask("Please, input ID item.");
        boolean deletedItem = tracker.deleted(id);
        if(deletedItem) {
            System.out.println("Item deleted.");
        } else {
            System.out.println("Item not deleted.");
        }
    }

    @Override
    public String info() {
        return "Deleted item";
    }
}
