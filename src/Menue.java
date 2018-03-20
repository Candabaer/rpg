import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menue {
    private World world;

    public Menue() {
        world = new World();
    }

    private void startScreen() {
        Boolean menueLoop = true;
        String vote = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (menueLoop) {
            System.out.print("1. Character erstellen" +
                             "\n2. Character laden" +
                             "\n3. Beenden\n");
            try {
                vote = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (vote) {
                case "1":
                    world.createPlayerCharacter();
                    menueLoop = false;
                    break;
                case "2":
                    menueLoop = false;
                    break;
                case "3":
                    menueLoop = false;
                    break;
                default:
                    System.out.println("You've fucked up my nigger");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Menue menue = new Menue();
        menue.startScreen();
    }
}
