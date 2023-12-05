package ru.netology.javaqa.untitledHome.services;

public class CalcServices {

    public int CalcServices(int income, int expenses, int threshold  ){

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                money = (money - expenses) / 3;
                count++;
            } else {
                money = money + income - expenses;

            }
        }
        return count;
    }
}

