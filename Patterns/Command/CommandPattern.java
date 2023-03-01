package Patterns.Command;

public class CommandPattern {
    public static void main(String[] args) {
        Macro macro = new Macro();

        Discord discord = new Discord();
        VoiceBox voiceBox = new VoiceBox();
        Valorant valorant = new Valorant();
        StreamLabs streamLabs = new StreamLabs();

        MacroCommand valorantCommand = new OpenValorant(discord, voiceBox, valorant, streamLabs);
        MacroCommand streamCommand = new StreamOnTwitch(discord, voiceBox, valorant, streamLabs);

        macro.assignMacro(1, streamCommand);
        macro.assignMacro(2, valorantCommand);

        macro.executeMacro(1);
        macro.executeMacro(2);
        macro.executeMacro(3);
    }
}