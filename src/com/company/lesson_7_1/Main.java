package com.company.lesson_7_1;

import java.io.*;

public class Main {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputString = input.readLine();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) % 2 == 0)
                even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
