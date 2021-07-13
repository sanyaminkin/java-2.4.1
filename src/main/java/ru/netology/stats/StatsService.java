package ru.netology.stats;

public class StatsService {

    public long allSalesAmount(long[] sales) {
        long sum = 0;
        for (long num : sales) {
            sum = sum + num;
        }
        return sum;
    }

    public long averageSalesAmount(long[] sales) {
        long sum = 0;
        for (long num : sales) {
            sum = sum + num;
        }
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long monthsWithSalesBelowAverage(long[] sales) {
        long sum = 0;
        for (long num : sales) {
            if (num < 15) {
                sum = sum + 1;
            } else {
                sum = sum;
            }
        }
        return sum;
    }

    public long monthsWithSalesAboveAverage(long[] sales) {
        long sum = 0;
        for (long num : sales) {
            if (num > 15) {
                sum = sum + 1;
            } else {
                sum = sum;
            }
        }
        return sum;
    }

}



