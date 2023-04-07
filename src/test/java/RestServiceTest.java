package ru.netology.java.javamvn.services;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestServiceTest {

    @Test
    void calculateRestMonthsShouldReturnZeroIfIncomeLessThanExpenses() {
        RestService service = new RestService();

        int income = 10000;
        int expenses = 20000;
        int threshold = 30000;

        int restMonths = service.calculateRestMonths(income, expenses, threshold);

        assertEquals(0, restMonths);
    }

    @Test
    void calculateRestMonthsShouldReturnZeroIfThresholdGreaterThanIncomeMinusExpenses() {
        RestService service = new RestService();

        int income = 40000;
        int expenses = 30000;
        int threshold = 20000;

        int restMonths = service.calculateRestMonths(income, expenses, threshold);

        assertEquals(4, restMonths);
    }

    @Test
    void calculateRestMonthsShouldReturnCorrectValue() {
        RestService service = new RestService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int restMonths = service.calculateRestMonths(income, expenses, threshold);

        assertEquals(10, restMonths);
    }

    @Test
    void calculateRestMonthsShouldReturnCorrectValueForBigNumbers() {
        RestService service = new RestService();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int restMonths = service.calculateRestMonths(income, expenses, threshold);

        assertEquals(5, restMonths);
    }
}