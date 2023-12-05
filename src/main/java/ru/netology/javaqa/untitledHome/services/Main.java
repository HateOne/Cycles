package ru.netology.javaqa.untitledHome.services;

public class Main {
    public static void main(String[] args) {

        int income;
        int expenses;
        int threshold;



        CalcServices service = new CalcServices();
        System.out.println(service.CalcServices(income = 10_000,expenses = 3_000,threshold = 20_000));


    }

}