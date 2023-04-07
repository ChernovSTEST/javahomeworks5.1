package ru.netology.java.javamvn.services;

public class RestService {

    public int calculateRestMonths(int income, int expenses, int threshold) {
        int balance = 0;
        int restMonths = 0;

        for (int i = 1; i <= 12; i++) {
            if (balance < threshold) {
                balance += income - expenses;
            } else {
                balance += income - expenses - (balance - threshold);
            }

            if (balance >= threshold) {
                balance -= expenses + (balance - threshold) / 3;
                restMonths++;
            }
        }

        return restMonths;
    }
}