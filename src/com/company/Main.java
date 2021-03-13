package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte percent = 100;
        final byte months_in_year = 12;
        int principal = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal($1K-$1M) : ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");

        }

        System.out.print("Annual Interest Rate : ");
        float rate = scanner.nextFloat();
        float monthly_interest_rate = rate/percent/months_in_year;

        while (true) {
            System.out.print("Period(Years) : ");
            years = scanner.nextByte();
            if (years>=1 && years<=30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        int number_of_payments = years*months_in_year;

        double mortgage = principal*(monthly_interest_rate*(Math.pow(monthly_interest_rate+1,number_of_payments)))
                /(Math.pow(monthly_interest_rate+1,number_of_payments)-1);

        String mortgage_Formatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage : " + mortgage_Formatted);
    }
}
