package ru.netology.stats;

public class StatsService {

    public long calculateTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long calculateAverageSale(long[] sales) {
        return calculateTotalSale(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthsBelowAverage(long[] sales) {
        int count = 0;
        long avarage = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < avarage) {
                count++;
            }
        }
        return count;
    }

    public int tMonthsBelowAverage(long[] sales) {
        int count = 0;
        long avarage = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale > avarage) {
                count++;
            }
        }
        return count;
    }
}
