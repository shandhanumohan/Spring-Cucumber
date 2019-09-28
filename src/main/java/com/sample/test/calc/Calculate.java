package com.sample.test.calc;

import org.springframework.stereotype.Component;

@Component
public class Calculate {
    public int multiply(String i, String j) {
        return Integer.parseInt(i) * Integer.parseInt(j);
    }

    public int add(String i, String j) {

        return Integer.parseInt(i) + Integer.parseInt(j);
    }

}
