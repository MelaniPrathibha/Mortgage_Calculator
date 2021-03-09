package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte percent = 100;
        final byte months_in_year = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal : ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate : ");
        float rate = scanner.nextFloat();
        float monthly_interest_rate = rate/percent/months_in_year;

        System.out.print("Period(Years) : ");
        byte years = scanner.nextByte();
        int number_of_payments = years*months_in_year;

        double mortgage = principal*(monthly_interest_rate*(Math.pow(monthly_interest_rate+1,number_of_payments)))
                /(Math.pow(monthly_interest_rate+1,number_of_payments)-1);

        String mortgage_Formatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage : " + mortgage_Formatted);
    }
}
