import java.util.*;

public class BattleManager {
    Character player;
    Character enemy;

    //Constructor to set player and enemy
    public BattleManager(Character playerVariable, Character enemyVariable) {
        player = playerVariable;
        enemy = enemyVariable;
    }

    //Initiate a 1 vs 1 battle
    public void oneVsOne(Scanner input) {    
        //Loop while neither player or enemy health is zero or below
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            ArrayList<Character> turnOrder = sortCharactersBySpeed(player, enemy);
            //Loop through the arraylist of players in order of speed for each turn
            for (Character attacker : turnOrder) {
                Character defender = getDefender(turnOrder, attacker);
                battleTurn(attacker, defender, input);
            }
        }
    }

    // In the BattleManager class
    public void battleTurn(Character attacker, Character defender, Scanner input) {
        if(!attacker.getIsEnemy()) {
            System.out.println("Select your move:");
            attacker.listMoves();
            Move selectedMove = attacker.getMoves().get(input.nextInt() - 1); // Method to select a move
            selectedMove.applyMove(attacker, defender);
        } else {
            Random rand = new Random();
            Move aiSelectedMove = attacker.getMoves().get(rand.nextInt(attacker.getMoves().size()));
            aiSelectedMove.applyMove(attacker, defender);
        }
    // Check if defender died
    if(defender.getHealth() <= 0) {
        defender.setHealth(0);
        System.out.print(attacker.getName() + " wins!"); 
    } else {
        defender.getResources();
    }
}


    //Returns the character that is not attacking
    private Character getDefender(ArrayList<Character> characters, Character currentCharacter) {
        for (Character character : characters) {
            if (character != currentCharacter) {
                return character;
            }
        }
        return null; // Handle the case when no opponent is found (unlikely in a two-player scenario)
    }

    //Sets the characters in order of speed
    private ArrayList<Character> sortCharactersBySpeed(Character player, Character enemy) {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(player);
        characters.add(enemy);
    
        // Sort characters based on speed
        Collections.sort(characters, Comparator.comparingInt(Character::getSpeed).reversed());
    
        return characters;
    }

    public static void battlePrompt(Character player, Character enemy) {
        System.out.println("You are being ATTACKED!");
        System.out.print("\n");
        player.getBattleLine();
        System.out.print("");
        enemy.getBattleLine();
        System.out.println();
    }
}