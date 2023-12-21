import java.util.*;

public class Character {
    private int level = 1;
    private String name;
    private String type = "default";
    private String eyeColor;
    private String textColor;
    private boolean isEnemy = true;
    
    //Moves
    private int maxMoves = 4;
    private ArrayList<Move> moves = new ArrayList<>();
    
    //Health
    private int health;
    private int maxHealth;
    private int healthRegen;
    
    //Defense
    private int defense;
    private int blocking;
    private int resistance;
    private int speed;
    
    //Attack
    private int attack;
    private int stamina;
    private int maxStamina;
    private int staminaRegen;
    

    //Magic
    private int magic;
    private int mana;
    private int maxMana;
    private int manaRegen;

    //Elemental
    private String elementalType;
    private int elementalStrength;
    private int power;
    private int maxPower;

    //Constructor
    public Character(Scanner input) {    
        createPlayer(input);
        Move strike = new Move("Strike", 0, 10, 0, 0, 0, 0, 
                       20, 100, 
                       1, // Assuming this is the areaOfEffectSize
                       10, // Assuming this is the areaOfEffectDamage
                       0, // duration
                       10, // criticalHitRate
                       "Physical", // elemental type
                       0, // elementalBoost
                       new ArrayList<>(), // statBuffArray
                       new ArrayList<>()); // buffAmountArray

        moves.add(strike);    
    }

    public Character() {
        name = EnemyFactory.randomName();
        type = EnemyFactory.randomType();
    }

    public Character(String enemyType) {
        name = EnemyFactory.randomName();
        type = enemyType;
    }

    public Character(String enemyName, String enemyType) {
        name = enemyName;
        type = enemyType;
    }    

    public void createPlayer(Scanner input) {
        isEnemy = false;
        System.out.print("Player name: ");
        name = input.nextLine();

        if(name.equals("")) {
            name = PlayerFactory.randomName();
        } 
        
        while(type.equals("default")) {
            
            System.out.println("Choose Your Class:");
            System.out.println("\t1. Warrior");
            System.out.println("\t2. Rogue");
            System.out.println("\t3. Mage");
            String typeInput = input.nextLine();
            
            switch (typeInput) {
                case "1":
                    type = "Warrior";
                    eyeColor = "Green";
                    textColor = TextEffects.GREEN;
                    break;
                case "2":
                    type = "Rogue";
                    eyeColor = "Blue";
                    textColor = TextEffects.BLUE;
                    break;
                case "3":
                    type = "Mage";
                    eyeColor = "Pink";
                    textColor = TextEffects.PURPLE;
                    break;
                case "GOD MODE":
                    type = "GOD";
                    eyeColor = "GOD";
                    textColor = TextEffects.BLACK;                    
                    break;
                default:
                    System.out.println("Invalid entry!");
                    break;
            }
        }
    }

    public void learnMove(Move newMove) {
        if (moves.size() < maxMoves ) {
            moves.add(newMove);
        } else {
            System.out.println("You already know 4 moves!");
        }
    }

    public void forgetMove(Move move) {
        moves.remove(move);
    }

    public void replaceMove(Move oldMove, Move newMove) {
        int moveIndex = moves.indexOf(oldMove);
        if (moveIndex != -1) {
            moves.set(moveIndex, newMove);
        } else {
            System.out.println("Move not found.");
        }
    }

    // Method to list all moves
    public void listMoves() {
        System.out.println("MOVESET:");
        int i = 1;
        for (Move move : moves) {
            System.out.println("\t" + i + ". " + 
            move.getName());
            i++;
        }
    }

    // Getters
    public int getLevel() { return level; }
    public String getName() { return name; }
    public String getType() { return type; }
    public String getEyeColor() { return eyeColor; }
    public String getTextColor() { return textColor; }
    public boolean getIsEnemy() { return isEnemy; }
    public int getMaxMoves() { return maxMoves; }
    public ArrayList<Move> getMoves() { return moves; }
    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public int getHealthRegen() { return healthRegen; }
    public int getDefense() { return defense; }
    public int getBlocking() { return blocking; }
    public int getResistance() { return resistance; }
    public int getSpeed() { return speed; }
    public int getAttack() { return attack; }
    public int getStamina() { return stamina; }
    public int getMaxStamina() { return maxStamina; }
    public int getStaminaRegen() { return staminaRegen; }
    public int getMagic() { return magic; }
    public int getMana() { return mana; }
    public int getMaxMana() { return maxMana; }
    public int getManaRegen() { return manaRegen; }
    public String getElementalType() { return elementalType; }
    public int getElementalStrength() { return elementalStrength; }
    public int getPower() { return power; }
    public int getMaxPower() { return maxPower; }

    // Setters
    public void setLevel(int level) { this.level = level; }
    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setEyeColor(String eyeColor) { this.eyeColor = eyeColor; }
    public void setTextColor(String textColor) { this.textColor = textColor; }
    public void setIsEnemy(boolean isEnemy) { this.isEnemy = isEnemy; }
    public void setMaxMoves(int maxMoves) { this.maxMoves = maxMoves; }
    public void setMoves(ArrayList<Move> moves) { this.moves = moves; }
    public void setHealth(int health) { 
        if(health >= 0 && health <= maxHealth){
            this.health = health;
            } else if(health < 0) {
                this.health = 0;
            } else if(health > maxHealth) {
                this.health = maxHealth;
            }
        }
    public void setMaxHealth(int maxHealth) { this.maxHealth = maxHealth; }
    public void setHealthRegen(int healthRegen) { this.healthRegen = healthRegen; }
    public void setDefense(int defense) { this.defense = defense; }
    public void setBlocking(int blocking) { this.blocking = blocking; }
    public void setResistance(int resistance) { this.resistance = resistance; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setAttack(int attack) { this.attack = attack; }
    public void setStamina(int stamina) {
        if(stamina >= 0 && stamina <= maxStamina){
            this.stamina = stamina;
            } else if(stamina < 0) {
                this.stamina = 0;
            } else if(stamina > maxStamina) {
                this.stamina = maxStamina;
            }
    }
    public void setMaxStamina(int maxStamina) { this.maxStamina = maxStamina; }
    public void setStaminaRegen(int staminaRegen) { this.staminaRegen = staminaRegen; }
    public void setMagic(int magic) { this.magic = magic; }
    public void setMana(int mana) { 
        if(mana >= 0 && mana <= maxMana){
            this.mana = mana;
            } else if(mana < 0) {
                this.mana = 0;
            } else if(mana > maxMana) {
                this.mana = maxMana;
            }
    }
    public void setMaxMana(int maxMana) { this.maxMana = maxMana; }
    public void setManaRegen(int manaRegen) { this.manaRegen = manaRegen; }
    public void setElementalType(String elementalType) { this.elementalType = elementalType; }
    public void setElementalStrength(int elementalStrength) { this.elementalStrength = elementalStrength; }
    public void setPower(int power) { 
        if(power >= 0 && power <= maxPower){
            this.power = power;
            } else if(power < 0) {
                this.power = 0;
            } else if(power > maxPower) {
                this.power = maxPower;
            }
    }
    public void setMaxPower(int maxPower) { this.maxPower = maxPower; }


    public String getStats() { // Needs to be revisited
        return "\tLevel " + level + "\n\tAttack: " + attack + 
                "\n\tDefense: " + defense + "\n\tMagic: " + magic + 
                "\n\tResistance: " + resistance + "\n\tSpeed " + speed;
    }

    public String getResources() { // Needs to be revisited
        return "\tHealth: " + health + "/" + maxHealth + 
                "\n\tMana: " + mana + "/" + maxMana + "\n\tStamina: " + 
                stamina + "/" + maxStamina;
    }

    public void getStatus() { // Needs to be revisited
        System.out.println(this.getName() + " the " + this.getType());
        System.out.println(this.getStats());
        System.out.println(this.getResources());
        this.listMoves();
    }

    public void getBattleLine() {
        System.out.println(name + " the " + type + ": " + getHealth() + 
                            "/" + getMaxHealth() + " HP");
    }
}