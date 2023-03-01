package Patterns.Visitor;

class PCGameCD implements GameCD {
    private double price;

    public PCGameCD(double price) {
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