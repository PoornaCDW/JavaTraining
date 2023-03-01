package Patterns.Command;

public class EmptyMacro extends MacroCommand {

    @Override
    public void execute() {
        System.out.println("Empty Macro, happy to accept a macro/task.");
    }
}