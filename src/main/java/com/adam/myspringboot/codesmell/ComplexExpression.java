package com.adam.myspringboot.codesmell;

public class ComplexExpression {

    private static final int LOW_SCORE = 500;
    public static final int HIGH_SCORE = 700;
    public static final int HIGH_INCOME = 100000;
    private static final int LOW_INCOME = 40000;

    public static void main(String[] args) {

    }

    public void expression(int score, int income, boolean auth) {
        if (score > HIGH_SCORE) {
            accept();
            return;
        }
        if (income > HIGH_INCOME) {
            accept();
            return;
        }
        if (income > LOW_INCOME && income < HIGH_INCOME && auth && score > LOW_SCORE) {
            accept();
            return;
        }
        reject();
    }

    public void expression1(int score, int income, boolean auth) {

    }

    public void accept() {

    }

    public void reject() {

    }
}
