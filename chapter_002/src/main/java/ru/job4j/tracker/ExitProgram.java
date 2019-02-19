package ru.job4j.tracker;

public class ExitProgram implements UserAction {

    private final StartUI ui;
    int key;

    public ExitProgram(StartUI ui) {
        this.ui = ui;
    }

    @Override
    public int key() {
        return 6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("exit program");
        this.ui.stop();
    }

    @Override
    public String info() {
        return "Exit program - 6";
    }
}
