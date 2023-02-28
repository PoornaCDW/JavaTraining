package Patterns.Factory;

import java.util.Scanner;

public class FactoryPattern {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String watchCompany;

        System.out.println("Enter the watch");
        watchCompany = scanner.next();

        WatchFactory watchFactory = (WatchFactory)Class.forName(watchCompany).getConstructor().newInstance();
        WatchShop watchShop = (WatchShop)Class.forName("Patterns.Factory.MallWatchShop").getConstructor().newInstance();

        watchShop.setFactory(watchFactory);
        System.out.println(watchShop.sellWatch(new Customer()));

        scanner.close();
    }
}