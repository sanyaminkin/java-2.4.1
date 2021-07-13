package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void allSalesAmount() {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.allSalesAmount(sales);
        assertEquals(expected, actual);

    }

    @Test
    void averageSalesAmount() {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        long actual = service.averageSalesAmount(sales);
        assertEquals(expected, actual);

    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void minSales() {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void monthsWithSalesBelowAverage() {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.monthsWithSalesBelowAverage(sales);
        assertEquals(expected, actual);

    }

    @Test
    void monthsWithSalesAboveAverage() {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.monthsWithSalesAboveAverage(sales);
        assertEquals(expected, actual);

    }

}