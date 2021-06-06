/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex11;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner euro = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        String euroS = euro.nextLine();
        double euroD = Double.parseDouble(euroS);

        Scanner exRate = new Scanner(System.in);
        System.out.print("What is the exchange rate? ");
        String exRateS = exRate.nextLine();
        float exRateF = Float.parseFloat(exRateS);

        double usd = euroD * exRateF;

        System.out.format("%.0f euros at an exchange rate of %f is\n%.2f U.S. dollars.", euroD, exRateF, usd);
    }
}