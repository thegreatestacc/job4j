package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Объект для генерации рандомного числа.
     */
    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        String id = String.valueOf(System.currentTimeMillis() + RN.nextInt());
        return id;
    }

    /**
     * Метод для выхода из программы.
     * @param key
     * @return
     */
    public boolean exit(String key) {
        boolean result = false;
        if (key.equals("y")) {
            result = true;
        }
        return result;
    }

    /**
     * Метод для редактирования заявок.
     * @param id
     * @param item
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                item.setId(id);
                this.items.set(i, item);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод для удаления заявок.
     * @param id
     */
    public boolean deleted(String id) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                this.items.remove(i);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод для получения списка всех заявок.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Метод для поиска по имени заявки.
     * @param key
     */
    public List<Item> findByName(String key) {
        List<Item> list = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                list.add(item);
            }
        }
        return list;
    }

    /**
     * Метод для поиска по ID заявки.
     * @param id
     */
    public Item findById(String id) {
        Item list = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                list = item;
            }
        }
        return list;
    }
}
