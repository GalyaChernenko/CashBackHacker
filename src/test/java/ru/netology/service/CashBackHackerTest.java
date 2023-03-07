package ru.netology.service;

import org.junit.Test;

import org.junit.Assert;

import static org.junit.Assert.*;

public class CashBackHackerTest {

    @Test
    public void RemainToBonus() {
        CashBackHacker service = new CashBackHacker();


        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        Assert.assertEquals(expected, actual);


    }


    @Test
    public void NoRemainToBonus() {
        CashBackHacker service = new CashBackHacker();


        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void RemainToBonusFrom0() {
        CashBackHacker service = new CashBackHacker();


        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(expected, actual);


    }
}
