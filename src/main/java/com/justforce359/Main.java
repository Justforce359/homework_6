package com.justforce359;

public class Main {

    public static void main(String[] args) {
        int a = 51;
        int b = 4;
        byte c = 127;
        double e = 3.0;


        int sum = a + b;
        System.out.println(sum);
        int sub = a - b;
        System.out.println(sub);
        int mul = a * b;
        System.out.println(mul);
        int div = a / b;
        System.out.println("deleniye = " + div);
        System.out.println("ostatok ot deleniya: " + a % b);
        System.out.println("a++: " + (++a));
        System.out.println("--a: " + (--a));
        System.out.println("a == b = " + false);
        System.out.println("a != b = " + true);
        System.out.println("a > d = " + false);
        System.out.println("c++:" + (++c));
        System.out.println("a + e: " + a * e);

        int j = 54;
        int v = 85;
        int y = 1;
        int w = 120;

        if (j > v && v < y)
            System.out.println(true);
        else
            System.out.println(false);

        if (v >= j || w <= y)
            System.out.println(true);
        else
            System.out.println(false);
    }

}