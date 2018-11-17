package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositServiceTest {

    @Test
    void calculateDeposit() {

        int year = 365;
        int month = 30;
        int threeMonth = 92;
        int sixMonth = 181;

        {
            DepositService service = new DepositService();


            int sum = service.calculateDeposit (100_000, sixMonth, 10);
            assertEquals(104_958, sum);
        }

        {
            DepositService service = new DepositService();


            int sum = service.calculateDeposit(100_000, year, 10);
            assertEquals(110_000, sum);
        }

        {
            DepositService service = new DepositService();


            int sum = service.calculateDeposit(0, year, 10);
            assertEquals(0, sum);
        }

        {
            DepositService service = new DepositService();


            int sum = service.calculateDeposit(0, month, 10);
            assertEquals(0, sum);
        }
        {
            DepositService service = new DepositService();


            int sum = service.calculateDeposit(100_000, month, 10);
            assertEquals(100_821, sum);
        }
        {
            DepositService service = new DepositService();


            int sum = service.calculateDeposit(100_000, threeMonth, 10);
            assertEquals(102_520, sum);
        }

        {
            DepositService service = new DepositService();


            int sum = service.calculateDeposit(100_000, sixMonth, 8);
            assertEquals(103_967, sum);
        }


    }
}