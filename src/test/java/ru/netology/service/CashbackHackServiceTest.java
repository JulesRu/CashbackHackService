package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    @Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test
    public void remain0() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void remain999() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1001), 999);
    }
}