package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            // аналог sum = sum + sales;
            sum += sale;
        }
        return sum;
    }

    public long calculateMid(long[] sales) {
        long sum = 0;
        long month = 12;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / month;
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

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
}