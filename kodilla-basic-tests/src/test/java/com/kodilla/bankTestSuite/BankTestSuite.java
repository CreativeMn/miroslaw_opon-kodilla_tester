package com.kodilla.bankTestSuite;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTestSuite {
    @Test
    void shouldReturnZeroBalanceIfThereIsNoCashMachine() {
        Bank bank = prepareEmptyBank();
        double balance = bank.getBalance();
        Assertions.assertEquals(0, balance);
    }

    @Test
    void shouldReturnBalance() {
        CashMachine cashMachine1 = prepareCashMachine(new double[]{100, -50, 200});
        CashMachine cashMachine2 = prepareCashMachine(new double[]{-100, 100});
        Bank bank = prepareBank(new CashMachine[]{cashMachine1, cashMachine2});

        double balance = bank.getBalance();

        Assertions.assertEquals(250, balance);
    }

    @Test
    void shouldReturnZeroPayoutsCountIfThereIsNoCashMachine() {
        Bank bank = prepareEmptyBank();

        int payoutsCount = bank.getPayoutsCount();

        Assertions.assertEquals(0, payoutsCount);
    }

    @Test
    void shouldReturnPayoutsCount() {
        CashMachine cashMachine1 = prepareCashMachine(new double[]{100, -50, 200});
        CashMachine cashMachine2 = prepareCashMachine(new double[]{-100, 100});
        Bank bank = prepareBank(new CashMachine[]{cashMachine1, cashMachine2});

        int payoutsCount = bank.getPayoutsCount();

        Assertions.assertEquals(2, payoutsCount);
    }

    @Test
    void shouldReturnZeroPaymentsCountIfThereIsNoCashMachine() {
        Bank bank = prepareEmptyBank();

        int paymentsCount = bank.getPaymentsCount();

        Assertions.assertEquals(0, paymentsCount);
    }

    @Test
    void shouldReturnPaymentsCount() {
        CashMachine cashMachine1 = prepareCashMachine(new double[]{100, -50, 200});
        CashMachine cashMachine2 = prepareCashMachine(new double[]{-100, 100});
        Bank bank = prepareBank(new CashMachine[]{cashMachine1, cashMachine2});

        int paymentsCount = bank.getPaymentsCount();

        Assertions.assertEquals(3, paymentsCount);
    }

    @Test
    void shouldReturnZeroPayoutsAverageIfThereIsNoCashMachine() {
        Bank bank = prepareEmptyBank();

        double payoutsAverage = bank.getPayoutsAverage();

        Assertions.assertEquals(0, payoutsAverage);
    }

    @Test
    void shouldReturnPayoutsAverage() {

        CashMachine cashMachine1 = prepareCashMachine(new double[]{100, -50, 200});
        CashMachine cashMachine2 = prepareCashMachine(new double[]{-100, 100});
        Bank bank = prepareBank(new CashMachine[]{cashMachine1, cashMachine2});

        double payoutsAverage = bank.getPayoutsAverage();

        Assertions.assertEquals(75, payoutsAverage);
    }

    @Test
    void shouldReturnZeroPaymentsAverageIfThereIsNoCashMachine() {
        Bank bank = prepareEmptyBank();

        double paymentsAverage = bank.getPaymentsAverage();

        Assertions.assertEquals(0, paymentsAverage);
    }

    @Test
    void shouldReturnPaymentsAverage() {
        CashMachine cashMachine1 = prepareCashMachine(new double[]{100, -50, 200});
        CashMachine cashMachine2 = prepareCashMachine(new double[]{-100, 100});
        Bank bank = prepareBank(new CashMachine[]{cashMachine1, cashMachine2});

        double paymentsAverage = bank.getPaymentsAverage();

        Assertions.assertEquals(400.0/3, paymentsAverage, 0.01);
    }

    private CashMachine prepareCashMachine(double[] transactions) {
        return new CashMachine(transactions);
    }

    private Bank prepareBank(CashMachine[] cashMachines) {
        return new Bank(cashMachines);
    }

    private Bank prepareEmptyBank() {
        return new Bank(new CashMachine[] {});
    }
}
