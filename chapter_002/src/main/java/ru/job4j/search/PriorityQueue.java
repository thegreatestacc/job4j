package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позицию определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
       int j = tasks.size();
        for (int i = 0; i < j; i++) {
            if (task.getPriority() < tasks.get(i).getPriority()) {
                j = i;
                break;

            }
        }
        this.tasks.add(j, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}
