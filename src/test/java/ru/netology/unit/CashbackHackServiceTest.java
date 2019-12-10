package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    int amount;
    int expect;

    @Test
    void shouldReturn100IfAmountIs900() {
        int actual = service.remain(amount = 900);
        assertEquals(expect=100,actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        int actual = service.remain(amount = 1000);
        assertEquals(expect = 0,actual);
    }

    @Test
    void shouldReturn1000IfAmountIs0() {

        int actual = service.remain(amount = 0);
        assertEquals(expect = 1000,actual);
    }
}