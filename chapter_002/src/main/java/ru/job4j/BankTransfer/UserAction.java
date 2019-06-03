package ru.job4j.BankTransfer;

/**
Реализовать коллекцию Map для банка
Необходимо создать класс User с полями name, passport.
Добавить методы eqauls() hashCode()
Необходимо создать класс Account с полями value (кол-во денег), requisites (реквизиты счёта) - это банковский счёт.
Реализовать коллекцию Map <User, List<Account>>, обозначающую что у каждого пользователя может быть список банковских счетов.
Необходимо реализовать возможность перечислять деньги, как с одного счёта User на другой счёт того же User, так и на счёт другого User.
 **/


import java.util.List;
import java.util.Map;

public class UserAction {

    //список банковских счетов пользователя
    List<Account> accountList;

    //список всех пользователей с их аккаунтами
    Map<User, List<Account>> listBanksAccounts;

    //добавление пользователя
    public void addUser(User user) {
        listBanksAccounts.put(user, accountList);
    }

    //удаление пользователя.
    public void deleteUser(User user) {
        listBanksAccounts.remove(user, accountList);
    }

    //добавить счёт пользователю.
    public void addAccountToUser(String passport, Account account) {

    }

    //удалить один счёт пользователя.
    public void deleteAccountFromUser(String passport, Account account) {
        accountList.remove(account);
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
