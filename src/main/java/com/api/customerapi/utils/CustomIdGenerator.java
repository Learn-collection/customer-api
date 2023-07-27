package com.api.customerapi.utils;

import java.util.Random;

public class CustomIdGenerator {
    private static final Random random = new Random();

    public static String generateIdRandomSixDigit() {
        int number = random.nextInt(100000);
        return String.format("%06d", number);
    }
}
