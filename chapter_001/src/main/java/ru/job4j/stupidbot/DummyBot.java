package ru.job4j.stupidbot;

/**
 * @author Vladimir Solovev (sovliv@yandex.ru)
 * @version 1.0
 * @since 22.01.2019
 */
public class DummyBot {

    /**
     *Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */

    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

}
