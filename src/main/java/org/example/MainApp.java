package org.example;

public class MainApp {

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        int result = calc.add(4,5);
        int result1 = calc.subtract(9,4);
        int result2 = calc.subtract(6,5);
        int result3 = calc.subtract(8,2);


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}