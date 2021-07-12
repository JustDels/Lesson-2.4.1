package ru.netology.stats;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumSales() {
        long expected = 180;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void midSales() {
        long expected = 15;
        long actual = service.calculateMid(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minMonth() {
        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxMonth() {
        long expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }
}