package Patterns.Visitor;

class XboxGameCD implements GameCD {
    private double price;

    public XboxGameCD(double price) {
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