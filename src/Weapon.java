import java.util.Map;

public class Weapon extends Item {
    private int damage;

    public Weapon(final int durability, final int activeUses, final int buff, final String type,
            Map<String, Integer> requirement, int damage) {
        super(durability, activeUses, buff, type, requirement);
        this.damage = damage;
    }
}
