import java.util.ArrayList;

public class Move {
    private String name;
    private int manaCost;
    private int staminaCost;
    private int healthCost;
    private int manaRecovery;
    private int staminaRecovery;
    private int healthRecovery;
    private int damage;
    private int accuracy;
    private int areaOfEffectSize;
    private int areaOfEffectDamage;
    private int duration;
    private int criticalHitRate;
    private String elemental;
    private int elementalBoost;
    private ArrayList<String> statBuffArray;
    private ArrayList<Integer> buffAmountArray;

    // Constructor
    public Move(String name, int manaCost, int staminaCost, int healthCost,
                int manaRecovery, int staminaRecovery, int healthRecovery,
                int damage, int accuracy, int areaOfEffectSize, int areaOfEffectDamage,
                int duration, int criticalHitRate, String elemental, int elementalBoost,
                ArrayList<String> statBuffArray, ArrayList<Integer> buffAmountArray) {
        this.name = name;
        this.manaCost = manaCost;
        this.staminaCost = staminaCost;
        this.healthCost = healthCost;
        this.manaRecovery = manaRecovery;
        this.staminaRecovery = staminaRecovery;
        this.healthRecovery = healthRecovery;
        this.damage = damage;
        this.accuracy = accuracy;
        this.areaOfEffectSize = areaOfEffectSize;
        this.areaOfEffectDamage = areaOfEffectDamage;
        this.duration = duration;
        this.criticalHitRate = criticalHitRate;
        this.elemental = elemental;
        this.elementalBoost = elementalBoost;
        this.statBuffArray = new ArrayList<>(statBuffArray);
        this.buffAmountArray = new ArrayList<>(buffAmountArray);
    
    }
        

// Getters
public String getName() { return name; }
public int getManaCost() { return manaCost; }
public int getStaminaCost() { return staminaCost; }
public int getHealthCost() { return healthCost; }
public int getManaRecovery() { return manaRecovery; }
public int getStaminaRecovery() { return staminaRecovery; }
public int getHealthRecovery() { return healthRecovery; }
public int getDamage() { return damage; }
public int getAccuracy() { return accuracy; }
public int getAreaOfEffectSize() { return areaOfEffectSize; }
public int getAreaOfEffectDamage() { return areaOfEffectDamage; }
public int getDuration() { return duration; }
public int getCriticalHitRate() { return criticalHitRate; }
public String getElemental() { return elemental; }
public int getElementalBoost() { return elementalBoost; }
public ArrayList<String> getStatBuffArray() { return new ArrayList<>(statBuffArray); }
public ArrayList<Integer> getBuffAmountArray() { return new ArrayList<>(buffAmountArray); }

// Setters
public void setName(String name) { this.name = name; }
public void setManaCost(int manaCost) { this.manaCost = manaCost; }
public void setStaminaCost(int staminaCost) { this.staminaCost = staminaCost; }
public void setHealthCost(int healthCost) { this.healthCost = healthCost; }
public void setManaRecovery(int manaRecovery) { this.manaRecovery = manaRecovery; }
public void setStaminaRecovery(int staminaRecovery) { this.staminaRecovery = staminaRecovery; }
public void setHealthRecovery(int healthRecovery) { this.healthRecovery = healthRecovery; }
public void setDamage(int damage) { this.damage = damage; }
public void setAccuracy(int accuracy) { this.accuracy = accuracy; }
public void setAreaOfEffectSize(int areaOfEffectSize) { this.areaOfEffectSize = areaOfEffectSize; }
public void setAreaOfEffectDamage(int areaOfEffectDamage) { this.areaOfEffectDamage = areaOfEffectDamage; }
public void setDuration(int duration) { this.duration = duration; }
public void setCriticalHitRate(int criticalHitRate) { this.criticalHitRate = criticalHitRate; }
public void setElemental(String elemental) { this.elemental = elemental; }
public void setElementalBoost(int elementalBoost) { this.elementalBoost = elementalBoost; }
public void setStatBuffArray(ArrayList<String> statBuffArray) { this.statBuffArray = new ArrayList<>(statBuffArray); }
public void setBuffAmountArray(ArrayList<Integer> buffAmountArray) { this.buffAmountArray = new ArrayList<>(buffAmountArray); }


    // Method to apply the move during a battle
    public void applyMove(Character attacker, Character target) {
        // Deduct costs from the attacker
        attacker.setMana(attacker.getMana() - manaCost);
        attacker.setStamina(attacker.getStamina() - staminaCost);
        attacker.setHealth(attacker.getHealth() - healthCost);

        // Apply damage to the target
        target.setHealth(target.getHealth() - damage);

        // Apply recovery to the attacker
        attacker.setMana(attacker.getMana() + manaRecovery);
        attacker.setStamina(attacker.getStamina() + staminaRecovery);
        attacker.setHealth(attacker.getHealth() + healthRecovery);

        // Handle duration effects
        /* 
        if (duration > 0) {
            // Implement logic for moves with duration
        } */

        // Message the console with the results
        System.out.println(attacker.getName() + " attacks " + target.getName() + " with " + name + " for " + damage + " damage. \n" + target.getName() + " HP: " + target.getHealth() + "/" + target.getMaxHealth());
    }
}

