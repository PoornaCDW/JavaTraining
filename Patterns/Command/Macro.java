package Patterns.Command;

import java.util.ArrayList;

class Macro {
    ArrayList<MacroCommand> macroCommands = new ArrayList<>();

    public Macro() {
        for(int i=1; i<3; i++)
            macroCommands.add(new EmptyMacro());
    }

    public void executeMacro(int slot) {
        macroCommands.get(slot).execute();
    }
    
    public void assignMacro(int slot, MacroCommand macroCommand) {
        macroCommands.add(slot, macroCommand);
    }
}