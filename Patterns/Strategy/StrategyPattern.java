package Patterns.Strategy;

import java.util.Scanner;

public class StrategyPattern {
    public static void main(String[] args) throws Exception {
        //Static Binding
        MonthIfElse monthIfElse = new MonthIfElse();
        monthIfElse.printMonth(12);

        //Dynamic Binding implemented using Stretegy pattern by eleminating if-else
        Scanner scanner = new Scanner(System.in);
        String monthClass;
        System.out.println("Enter the month class name:");
        monthClass = scanner.next();
        Month month = (Month)Class.forName(monthClass).getConstructor().newInstance();
        month.printDays();
        scanner.close();
    }
}