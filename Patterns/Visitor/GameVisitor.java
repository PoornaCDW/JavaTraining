package Patterns.Visitor;

interface GameVisitor {
    void visit(PCGameCD pcGameCD);
    void visit(PS4GameCD ps4GameCD);
    void visit(XboxGameCD xboxGameCD);
    void visit(SwitchGameCD switchGameCD);
}