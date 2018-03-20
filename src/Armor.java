import java.util.Map;

public class Armor extends Item {
    private int damageReduction;

    public Armor(final int durability, final int activeUses, final int buff, final String type,
            Map<String, Integer> requirement,int damageReduction) {
        super(durability, activeUses, buff, type, requirement);
        this.damageReduction = damageReduction;
    }
}
