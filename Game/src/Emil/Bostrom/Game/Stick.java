package Emil.Bostrom.Game;

public class Stick extends Item {
    public Stick(String name) {
        super(name);
    }

    @Override
    public void apply(PlayableCharacter c){
        c.attack += 1;
    }
}