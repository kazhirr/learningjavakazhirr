package com.company.ForLoops;

import com.company.IfStatements.ElseAndIf;

public class NoticingEvenNumbers {
    public static void main(String[] args) {
        int a, b, c;

        for (a = 1; a <= 20; a++) {
            if (a % 2 == 0)
                System.out.println(a+" <");
            else System.out.println(a);
        }
    }
}
