import java.util.Map;
import java.util.Vector;

public abstract class Character {
    private int health;
    private String name;
    private Vector<Item> loot;
    private Vector<Item> equipment;
    private Vector<Skill> skill;

    private String race;

    private Map<String, Integer> statline;

    public Character(int health, String name, String race, Map<String, Integer> statline) {
        this.health = health;
        this.name = name;
        this.race = race;
        this.statline = statline;
    }
}