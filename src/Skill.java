import java.util.Map;

public class Skill {
    private enum Type {
        offensive, defensive, utility
    }
    private String name;
    private Type type;
    private int value;
    private Map<String, Integer> requirement;

    public Skill() {

    }
}
