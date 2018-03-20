import java.util.Map;

public abstract class Item {
    private int durability;
    private int activeUses;
    private int buff;
    private Map<String, Integer> requirement;
    private String type;

    public Item(int durability, int activeUses, int buff, String type, Map<String, Integer> requirement) {
        this.durability = durability;
        this.activeUses = activeUses;
        this.buff = buff;
        this.type = type;
        this.requirement = requirement;
    }
}
