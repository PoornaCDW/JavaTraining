package Patterns.Visitor;

class SwitchGameCD implements GameCD {
    private double price;

    public SwitchGameCD(double price) {
        this.price = price;
    }

    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}