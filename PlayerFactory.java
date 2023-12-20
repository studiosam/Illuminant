import java.util.ArrayList;
import java.util.Random;

public class PlayerFactory {
    public static void playerFactory(Character playerVariable) {
        switch (playerVariable.getType()) {
            case "Warrior":
                playerVariable.setAttack(10);
                playerVariable.setMaxHealth(100);
                playerVariable.setHealth(100);
                playerVariable.setHealthRegen(0);
                playerVariable.setDefense(8);
                playerVariable.setBlocking(8);
                playerVariable.setMagic(4);
                playerVariable.setResistance(6);
                playerVariable.setMaxMana(70);
                playerVariable.setMana(70);
                playerVariable.setManaRegen(1);
                playerVariable.setSpeed(9);
                playerVariable.setMaxStamina(100);
                playerVariable.setStamina(100);
                playerVariable.setStaminaRegen(10);
                
                Move cleave = new Move("Cleave", 0, 10, 0, 0, 0, 0, 
                       15 + playerVariable.getAttack(), 100, 
                       1, // Assuming areaOfEffectSize
                       10, // Assuming areaOfEffectDamage
                       0, // duration
                       10, // criticalHitRate
                       "Earth", // elemental type
                       20, // elementalBoost
                       new ArrayList<>(), // statBuffArray
                       new ArrayList<>()); // buffAmountArray

                playerVariable.learnMove(cleave);
                                            break;
            case "Rogue":
                playerVariable.setAttack(8);
                playerVariable.setMaxHealth(100);
                playerVariable.setHealth(100);
                playerVariable.setHealthRegen(0);
                playerVariable.setDefense(10);
                playerVariable.setBlocking(6);
                playerVariable.setMagic(7);
                playerVariable.setResistance(8);
                playerVariable.setMaxMana(100);
                playerVariable.setMana(100);
                playerVariable.setManaRegen(5);
                playerVariable.setSpeed(14);
                playerVariable.setMaxStamina(100);
                playerVariable.setStamina(100);
                playerVariable.setStaminaRegen(7);
                
                Move fluidPierce = new Move("Fluid Pierce", 0, 10, 0, 0, 0, 0, 
                             15 + playerVariable.getSpeed(), 100, 
                             1, // Assuming this is the areaOfEffectSize
                             10, // Assuming this is the areaOfEffectDamage
                             0, // duration
                             10, // criticalHitRate
                             "Fluid", // elemental type
                             20, // elementalBoost
                             new ArrayList<>(), // statBuffArray
                             new ArrayList<>()); // buffAmountArray
                
                playerVariable.learnMove(fluidPierce);
                break;
            case "Mage":
                playerVariable.setAttack(5);
                playerVariable.setMaxHealth(100);
                playerVariable.setHealth(100);
                playerVariable.setHealthRegen(0);
                playerVariable.setDefense(7);
                playerVariable.setBlocking(4);
                playerVariable.setMagic(12);
                playerVariable.setResistance(10);
                playerVariable.setSpeed(10);
                playerVariable.setMaxMana(120);
                playerVariable.setMana(120);
                playerVariable.setManaRegen(10);
                playerVariable.setMaxStamina(100);
                playerVariable.setStamina(100);
                playerVariable.setStaminaRegen(5);
                Move fireball = new Move("Fireball", 8, 0, 0, 0, 0, 0, 
                         15 + playerVariable.getAttack(), 100, 
                         1, // Assuming this is the areaOfEffectSize
                         10, // Assuming this is the areaOfEffectDamage
                         0, // duration
                         10, // criticalHitRate
                         "Fire", // elemental type
                         20, // elementalBoost
                         new ArrayList<>(), // statBuffArray
                         new ArrayList<>()); // buffAmountArray

                playerVariable.learnMove(fireball);
                break;
            case "GOD":
                playerVariable.setAttack(1000);
                playerVariable.setMaxHealth(1000);
                playerVariable.setHealth(1000);
                playerVariable.setHealthRegen(1000);
                playerVariable.setDefense(1000);
                playerVariable.setBlocking(1000);
                playerVariable.setMagic(1000);
                playerVariable.setResistance(1000);
                playerVariable.setMaxMana(1000);
                playerVariable.setMana(1000);
                playerVariable.setManaRegen(1000);
                playerVariable.setSpeed(100);
                playerVariable.setMaxStamina(1000);
                playerVariable.setStamina(1000);
                playerVariable.setStaminaRegen(1000);
                break;
        }
    }

    public static String randomName() {
        
        Random rand = new Random();

        String[] names = { "Thorneon", "Zephyrion", "Darianth", "Lyricus", "Seraphiel", "Valerian", "Drystan", "Aetheron", "Calidian", "Morvain", "Xandor", "Kaelith", "Galadrian", "Arionis", "Fenrisian", "Elowen", "Isoldeira", "Selenea", "Seraphina", "Lyrielle", "Eveloria", "Thalassa", "Evadne", "Calista", "Astridara", "Lirelia", "Vespera", "Sylvaria", "Fiorana", "Elaraia", "Jethro", "Bill", "Sally", "Clarence", "Esther" };
    
        return names[rand.nextInt(names.length)];
    }

    
}
