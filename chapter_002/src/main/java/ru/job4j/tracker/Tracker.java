package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

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
        this.items[this.position++] = item;
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
        if(key.equals("y")) {
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
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                item.setId(id);
                this.items[i] = item;
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
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(this.items, i, this.items, i, position);
                position--;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод для получения списка всех заявок.
     */
    public Item[] findAll() {

        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод для поиска по имени заявки.
     * @param key
     */
    public Item[] findByName(String key) {
        int length = 0;
        Item[] result = new Item[position];
        for (int i = 0; i < position; i++) {
            if (this.items[i].getName().equals(key)) {
                result[length] = this.items[i];
                length++;
            }
        }
        return Arrays.copyOf(result, length);
    }

    /**
     * Метод для поиска по ID заявки.
     * @param id
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                result = this.items[i];
            }
        }
        return result;
    }
}
