package Patterns.Visitor;

class GamePriceCalculator implements GameVisitor {
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void visit(PCGameCD pcGameCD) {
        totalPrice += pcGameCD.getPrice();
    }

    @Override
    public void visit(PS4GameCD ps4GameCD) {
        totalPrice += ps4GameCD.getPrice() * 2;
    }

    @Override
    public void visit(XboxGameCD xboxGameCD) {
        totalPrice += xboxGameCD.getPrice() * 1.5;
    }

    @Override
    public void visit(SwitchGameCD switchGameCD) {
        totalPrice += switchGameCD.getPrice() * 0.5;
    }
}