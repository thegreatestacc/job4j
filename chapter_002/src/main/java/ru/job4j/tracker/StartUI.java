package ru.job4j.tracker;

public class StartUI {

    /**
     * 1)Константа меню для добавления новой заявки.
     * 2)Константа меню для просмотра всех заявок.
     * 3)Константа меню для редактирвания заявки.
     * 4)Константа меню для удаления заявки.
     * 5)Константа меню для поиска заявки по ID.
     * 6)Константа меню для поиска по имени заявки.
     * 7)Константа для выхода из цикла.
     */
    private static final String ADD = "0";
    private static final String SHOW_ALL = "1";
    private static final String EDIT = "2";
    private static final String DELETED = "3";
    private static final String FIND_BY_ID = "4";
    private static final String FIND_BY_NAME = "5";
    private static final String EXIT = "6";

    /**
     * Получение данных от пользователя.
     */
    private final ConsoleInput input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW_ALL.equals(answer)) {
                this.showAllItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETED.equals(answer)) {
                this.deletedItem();
            } else if (FIND_BY_ID.equals(answer)) {
                this.findByIdItem();
            } else if (FIND_BY_NAME.equals(answer)) {
                this.findByIdName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    private void showMenu() {
        System.out.println("Меню.\n"
           + "Добавить заявку - 0.\n"
           + "Просмотр всех заявок - 1.\n"
           + "Редактирование заявки - 2.\n"
           + "Удаление заявки - 3.\n"
           + "Поиск заявки по ID - 4.\n"
           + "Поиск заявки по имени - 5.\n"
           + "Выход из программы - 6.\n"
           + "Выберите операцию...\n");
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desk = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desk);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + " -----------");
    }

    private void showAllItems() {
        System.out.println("------------ Все заявки --------------");
        Item[] items = this.tracker.findAll();
        for (Item item : items) {
            System.out.println("ID заявки: " + item.getId() + " " + "Имя заявки: " + item.getName() + " Описание заявки: " + item.getDesk());
        }
        System.out.println("--------------------------------------");
    }

    private void editItem() {
        System.out.println("------------ Редактирование заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String id = this.input.ask("Введите ID заявки :");
        String desk = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desk);
        boolean trackEdit = this.tracker.replace(id, item);
        if (trackEdit) {
            System.out.println("Заявека изменена.");
            System.out.println("Новые данные заявки: id - " + item.getId() + ", имя - " + item.getName() + ", описание - " + item.getDesk());
        } else {
            System.out.println("Заявка не отредактирована.");
        }
    }

    private void deletedItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите ID заявки :");
        boolean trackDeleted = this.tracker.deleted(id);
        if (trackDeleted) {
            System.out.println("Заявка удалена.");
        } else {
            System.out.println("Заявка не удалена.");
        }
    }

    private void findByIdItem() {
        System.out.println("------------ Поиск заявки по ID --------------");
        String id = this.input.ask("Введите ID заявки :");
        Item item = this.tracker.findById(id);
        System.out.println("Заявка найдена.");
        System.out.println("ID заявки: " + item.getId() + ", имя заявки: " + item.getName() + ", описание заявки: " + item.getDesk());
    }

    private void findByIdName() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки :");
        Item[] items = this.tracker.findByName(name);
        for (Item item : items) {
            System.out.println("Заявка найдена. ID заявки: " + item.getId() + ", имя заявки: " + item.getName() + ", описание заявки: " + item.getDesk());
        }
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
