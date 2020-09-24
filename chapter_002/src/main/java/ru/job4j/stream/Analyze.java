package ru.job4j.stream;

import java.util.List;
import java.util.stream.Stream;

/**
 * Класс Analyze получает статистику по аттестатам.
 * Метод averageScore вычисляет общий средний балл.
 *
 * Метод averageScoreBySubject вычисляет средний балл ученика по его предметам.
 * Возвращает список из объекта Tuple (имя ученика и средний балл).
 *
 * Метод averageScoreByPupil вычисляет средний балл по всем предметам для каждого ученика.
 * Возвращает список из объекта Tuple (название предмета и средний балл).
 *
 * Метод bestStudent - возвращает лучшего ученика. Лучшим считается ученик с наибольшим баллом по всем предметам.
 *
 * Метод bestSubject - возвращает предмет с наибольшим баллом для всех студентов.
 * Возвращает объект Tuple (имя предмета, сумма баллов каждого ученика по этому предмету)
 *
 * Для решения этой задачи вам нужны методы mapToInt, sum, average.
 */
public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.getSubjects().stream())
                .mapToDouble(Subject::getScore)
                .average()
                .getAsDouble();
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return List.of(

        );
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return List.of();
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return null;
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}
