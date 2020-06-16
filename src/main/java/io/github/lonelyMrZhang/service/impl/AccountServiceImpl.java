package io.github.lonelyMrZhang.service.impl;

import io.github.lonelyMrZhang.dao.IAccountDao;
import io.github.lonelyMrZhang.entity.Account;
import io.github.lonelyMrZhang.service.IAccountService;

import java.util.List;

/**
 * @description: 账户业务层实现类
 * @author: lonely.mr.zhang
 * @date: 2020/6/15 11:31 下午
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }
}
