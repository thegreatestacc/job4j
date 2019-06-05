package ru.job4j.BankTransfer;

/**
 * @author Vladimir Solovyov (sovliv@yandex.ru)
 * @since 05.06.2019
 * @version 1.0
 **/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAction {

    //список всех пользователей с их аккаунтами
    Map<User, List<Account>> listBanksAccounts = new HashMap<>();

    //добавление пользователя
    public void addUser(User user) {
        this.listBanksAccounts.put(user, new ArrayList<>());
    }

    //удаление пользователя.
    public void deleteUser(User user) {
        this.listBanksAccounts.remove(user);
    }

    //добавить счёт пользователю.
    public void addAccountToUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> userAcc : listBanksAccounts.entrySet()) {
            String userPassport = userAcc.getKey().getPassport();
            if (userPassport == passport) {

            }
        }
    }

    //удалить один счёт пользователя.
    public void deleteAccountFromUser(String passport, Account account) {
    }

    //получить список счетов для пользователя.
    public List<Account> getUserAccounts(String passport) {
        return null;
    }

    //метод для перечисления денег с одного счёта на другой счёт:
    //если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        return false;
    }
}
