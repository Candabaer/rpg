import java.util.Map;

public class World {

    public void createPlayerCharacter(){
        String name;
        int health;
        String race;
        Map<String, Integer> statline = null;

        rollForStats(statline);

        PlayerCharacter player = new PlayerCharacter();

    }

    private void rollForStats(Map<String, Integer> statline) {


    }
}
