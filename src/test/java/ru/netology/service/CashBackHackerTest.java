package ru.netology.service;

import org.testng.annotations.Test;

import org.testng.Assert;

import static org.testng.Assert.*;

public class CashBackHackerTest {


    @Test
    public void RemainToBonus() {
        CashBackHacker service = new CashBackHacker();

        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void NoRemainToBonus() {
        CashBackHacker service = new CashBackHacker();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void RemainToBonusFrom0() {
        CashBackHacker service = new CashBackHacker();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);

    }
}
