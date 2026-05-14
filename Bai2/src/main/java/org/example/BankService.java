package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankService {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(BankService.class);

    public void deposit(BankAccount account, double amount) {

        LOGGER.info("Deposit request from {}", account.getOwner());

        if (amount <= 0) {
            LOGGER.warn("Invalid amount: {}", amount);
            return;
        }

        account.deposit(amount);

        LOGGER.info("Deposit success. New balance: {}",
                account.getBalance());
    }
}