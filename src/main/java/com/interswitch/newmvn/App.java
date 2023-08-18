package com.interswitch.newmvn;

import com.interswitch.maven.Arithmetic;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        try{
            Scanner scanner = new Scanner(System.in);

            UpperLowerCase uCase = new UpperLowerCase();
            System.out.println(uCase.wordToUpperCase("joseph tamarakro ehizoba naomi"));

            UpperLowerCase lcase = new UpperLowerCase();
            System.out.println(lcase.wordToLowerCase("GOOD THINGS HAPPEN TO ANYONE"));
            System.out.println("New Go-home feature by " +
                    "BackboneTeam suggested at "
                    + LocalDate.now());

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
