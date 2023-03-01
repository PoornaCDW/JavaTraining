package Patterns.Visitor;

interface GameCD {
    void accept(GameVisitor visitor);
}