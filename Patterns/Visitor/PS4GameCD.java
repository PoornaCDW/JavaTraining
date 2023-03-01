package Patterns.Visitor;

class PS4GameCD implements GameCD {
    private double price;

    public PS4GameCD(double price) {
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