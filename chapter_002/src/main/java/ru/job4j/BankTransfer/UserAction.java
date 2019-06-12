package ru.job4j.BankTransfer;

/**
 * @author Vladimir Solovyov (sovliv@yandex.ru)
 * @since 05.06.2019
 * @version 1.0
 **/


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserAction {

    //список всех пользователей с их аккаунтами
    Map<User, List<Account>> listBanksAccounts;

    //добавление пользователя
    public void addUser(User user) {
        this.listBanksAccounts.putIfAbsent(user, new ArrayList<>());
    }

    //удаление пользователя.
    public void deleteUser(User user) {
        this.listBanksAccounts.remove(user);
    }

    //добавить счёт пользователю.
    public void addAccountToUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> userAcc : listBanksAccounts.entrySet()) {
            String userPassport = userAcc.getKey().getPassport();
            if (userPassport.equals(passport)) {
                userAcc.getValue().add(account);
            }
        }
    }

    //удалить один счёт пользователя.
    public void deleteAccountFromUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> userAcc : listBanksAccounts.entrySet()) {
            String userPassport = userAcc.getKey().getPassport();
            if (userPassport.equals(passport)) {
                userAcc.getValue().remove(account);
            }
        }
    }

    //получить список счетов для пользователя.
    public List<Account> getUserAccounts(String passport) {
        List<Account> result = null;
        for (Map.Entry<User, List<Account>> userAcc : listBanksAccounts.entrySet()) {
            String userPassport = userAcc.getKey().getPassport();
            if (userPassport.equals(passport)) {
                result = userAcc.getValue();
                break;
            }
        }
        return result;
    }

    //метод для перечисления денег с одного счёта на другой счёт:
    //если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.

    public boolean transferMoney(String srcPassport, String srcRequisite, String dstPassport, String dstRequisite, double amount) {
        Account srcAccount = findAccountByPassportAndRequisites(srcPassport, srcRequisite);
        Account dstAccount = findAccountByPassportAndRequisites(dstPassport, dstRequisite);

        if (srcAccount != null && dstAccount != null) {
            dstAccount.setValue(dstAccount.getValue() + amount);
            srcAccount.setValue(srcAccount.getValue() - amount);
            return true;
        }
        return false;
    }
    
    public Account findAccountByPassportAndRequisites(String passport, String requisites) {
        Account result = null;
        List<Account> userAcc = getUserAccounts(passport);
        for (Account userAccount : userAcc) {
            if (userAccount.getRequisites().equals(requisites)) {
                result = userAccount;
                break;
            }
        }
        return result;
    }
}
