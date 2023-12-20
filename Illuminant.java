import java.util.*;

public class Illuminant {
    
    public static void main(String[] args) {
        TextEffects.clearScreen();
        ASCIIScreenDisplays.startScreen();

        Story story = new Story();
        Scanner input = new Scanner(System.in);

        input.nextLine();
        story.intro();

        Character player = new Character(input);
        PlayerFactory.playerFactory(player);

        story.intro(player);

        Character clarenceTheBat = new Character("Clarence", "Bat");
        clarenceTheBat.setTextColor(TextEffects.CYAN);
        EnemyFactory.enemyFactory(clarenceTheBat);
        BattleManager.battlePrompt(player, clarenceTheBat);
        BattleManager clarenceTheBatBattle = new BattleManager(player, clarenceTheBat);
        clarenceTheBatBattle.oneVsOne(input);

        story.intro(player);

        return;
    }
}