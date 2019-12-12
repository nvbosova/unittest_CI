package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
    int actual;
    @Test
    void shouldReturn100IfAmountIs900() {
        actual = service.remain(900);
        assertEquals(100,actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        actual = service.remain(1000);
        assertEquals( 0,actual);
    }

    @Test
    void shouldReturn500IfAmountIs500() {

        actual = service.remain(500);
        assertEquals(500,actual);
    }

    @Test
    void shouldReturn900IfAmountIs100() {

        actual = service.remain(20000000);
        assertEquals(0, (char) actual);
    }
}