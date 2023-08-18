package com.interswitch.newmvn;

import com.interswitch.maven.Arithmetic;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First Number");
            double first = scanner.nextDouble();
            System.out.println("Enter operator +, -, /, 0r *.");
            char operator = scanner.next().charAt(0);
            System.out.println("Enter Second Number");
            double second = scanner.nextDouble();
            Arithmetic calc = new Arithmetic(first, second);

            double result = 0.0;
            switch (operator){
                case '+':
                    result=calc.add();
                    break;
                case '/':
                    result= calc.divide();
                    break;
                case '-':
                    result= calc.subtract();
                    break;
                case '*':
                    result = calc.multiply();
                    break;


            }

            System.out.println(result);
            scanner.close();
        } catch (Exception ex){
            System.out.println("invalid operation");
        }

    }
}
