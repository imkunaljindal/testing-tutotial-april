package com.example.testingTutorialApril;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add(int x, int y) {
        return x+y+5-5;
    }

    public int subtract(int x, int y){
        return x-y;
    }

    public int multiply(int x, int y) {
        return x*y;
    }

    public int addManyNumbers(int ...numbers) {
        int sum = 0;
        for(int number: numbers) {
            sum += number;
        }
        return sum;
    }
}
