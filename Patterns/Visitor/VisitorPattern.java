package Patterns.Visitor;

import java.util.Arrays;
import java.util.List;

public class VisitorPattern {
    public static void main(String[] args) {
        List<GameCD> gameCDs = Arrays.asList(
        new PCGameCD(50),
        new PS4GameCD(60),
        new XboxGameCD(55));

        GamePriceCalculator priceCalculator = new GamePriceCalculator();
        for (GameCD gameCD : gameCDs) {
            gameCD.accept(priceCalculator);
        }
        System.out.println("Total price: " + priceCalculator.getTotalPrice());
    }
}