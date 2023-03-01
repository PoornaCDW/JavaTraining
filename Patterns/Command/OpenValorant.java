package Patterns.Command;

class OpenValorant extends MacroCommand {
    public OpenValorant(Discord discord, VoiceBox voiceBox, Valorant valorant, StreamLabs streamLabs) {
        super(discord, voiceBox, valorant, streamLabs);
    }
    
    @Override
    public void execute() {
        System.out.println("Open Valorant macro started!");
        discord.GameServer();
        valorant.startGame();
    }
}
