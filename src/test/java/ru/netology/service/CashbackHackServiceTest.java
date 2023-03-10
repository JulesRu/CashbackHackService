package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    @Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void remain0() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void remain999() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(999, service.remain(1001));
    }
}