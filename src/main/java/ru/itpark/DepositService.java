package ru.itpark;

public class DepositService {
    public int calculateDeposit(int depositSum, int depositPeriod, int depositPercent) {


        int year = 365;

        int percentSum = depositSum * depositPercent * depositPeriod / year / 100;

        return depositSum + percentSum;


    }

}
