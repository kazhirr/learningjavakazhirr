package com.company.ForLoops;

public class XAndYs {
    public static void main(String[] args) {

        System.out.println("x       y");
        System.out.println("----------------");

        float y = 0;

        for (float x = -10.0f; x <= 10.0f; x += 0.5f)
        {
            System.out.print(x);
            y = x*x;
            System.out.println("    " + y);
        }

    }
}
