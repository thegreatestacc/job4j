package ru.job4j.tracker;

public class ExitProgram implements UserAction {

    int key;
    String command;

    public ExitProgram(int key, String command) {
        this.key = key;
        this.command = command;
    }

    @Override
    public int key() {
        return 7;
    }

    @Override
    public void execute(Input input, Tracker tracker) {

    }

    @Override
    public String info() {
        return "Exit program";
    }
}
