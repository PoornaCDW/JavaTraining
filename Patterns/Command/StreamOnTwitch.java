package Patterns.Command;

class StreamOnTwitch extends MacroCommand {
    public StreamOnTwitch(Discord discord, VoiceBox voiceBox, Valorant valorant, StreamLabs streamLabs) {
        super(discord, voiceBox, valorant, streamLabs);
    }

    @Override
    public void execute() {
        System.out.println("Stream on twitch macro started");
        voiceBox.removeNoise();
        stramLabs.startStreaming();
    }
}
