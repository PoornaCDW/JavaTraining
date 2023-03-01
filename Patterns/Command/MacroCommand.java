package Patterns.Command;

abstract class MacroCommand {
    Discord discord;
    VoiceBox voiceBox;
    Valorant valorant;
    StreamLabs stramLabs;

    public MacroCommand() {
        System.out.println("Macro Command!");
    }

    public MacroCommand(Discord discord, VoiceBox voiceBox, Valorant valorant, StreamLabs streamLabs) {
        this.discord = discord;
        this.voiceBox = voiceBox;
        this.valorant = valorant;
        this.stramLabs = streamLabs;
    }

    public abstract void execute();
}