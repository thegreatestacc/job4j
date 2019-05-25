package ru.job4j.tracker;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }
    
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Deleted item. ------------");
        String id = input.ask("Please, input ID item.");
        if (tracker.deleted(id)) {
            System.out.println("Item deleted.");
        } else {
            System.out.println("Item has not deleted.");
        }
    }
}
