import java.util.ArrayList;
import java.util.Random;

public class EnemyFactory {
    public static void enemyFactory(Character enemyVariable) {
        switch (enemyVariable.getType()) { 
            case "Bat":
                enemyVariable.setAttack(5);
                enemyVariable.setMaxHealth(40);
                enemyVariable.setHealth(40);
                enemyVariable.setHealthRegen(0);
                enemyVariable.setDefense(1);
                enemyVariable.setBlocking(3);
                enemyVariable.setMagic(4);
                enemyVariable.setResistance(6);
                enemyVariable.setMaxMana(0);
                enemyVariable.setMana(0);
                enemyVariable.setManaRegen(0);
                enemyVariable.setSpeed(16);
                enemyVariable.setMaxStamina(50);
                enemyVariable.setStamina(50);
                enemyVariable.setStaminaRegen(10);
                
                Move bite = new Move("Bite", 0, 10, 0, 0, 0, 0, 
                    enemyVariable.getAttack() + 5, 100, 
                    1, // Assuming this is the areaOfEffectSize
                    10, // Assuming this is the areaOfEffectDamage
                    0, // duration
                    10, // criticalHitRate
                    "Physical", // elemental type
                    0, // elementalBoost
                    new ArrayList<>(), // statBuffArray
                    new ArrayList<>()); // buffAmountArray

                enemyVariable.learnMove(bite);
            break;
            case "Skeleton":
                enemyVariable.setAttack(8);
                enemyVariable.setHealth(50);
                enemyVariable.setMaxHealth(50);
                enemyVariable.setHealthRegen(0);
                enemyVariable.setDefense(2);
                enemyVariable.setBlocking(5);
                enemyVariable.setMagic(8);
                enemyVariable.setResistance(10);
                enemyVariable.setMana(50);
                enemyVariable.setMaxMana(50);
                enemyVariable.setManaRegen(5);
                enemyVariable.setSpeed(6);
                enemyVariable.setStamina(60);
                enemyVariable.setMaxStamina(60);
                enemyVariable.setStaminaRegen(7);

                Move slash = new Move("Slash", 0, 10, 0, 0, 0, 0, 
                    enemyVariable.getAttack() + 10, 100, 
                    1, // Assuming this is the areaOfEffectSize
                    10, // Assuming this is the areaOfEffectDamage
                    0, // duration
                    10, // criticalHitRate
                    "Physical", // elemental type
                    0, // elementalBoost
                    new ArrayList<>(), // statBuffArray
                    new ArrayList<>()); // buffAmountArray

                enemyVariable.learnMove(slash);
                break;
                case "Armored Skeleton":
                enemyVariable.setAttack(9);
                enemyVariable.setHealth(80);
                enemyVariable.setMaxHealth(80);
                enemyVariable.setHealthRegen(0);
                enemyVariable.setDefense(5);
                enemyVariable.setBlocking(6);
                enemyVariable.setMagic(8);
                enemyVariable.setResistance(10);
                enemyVariable.setSpeed(4);
                enemyVariable.setMana(50);
                enemyVariable.setMaxMana(50);
                enemyVariable.setManaRegen(7);
                enemyVariable.setStamina(50);
                enemyVariable.setMaxStamina(50);
                enemyVariable.setStaminaRegen(7);
                
                Move shieldBash = new Move("Shield Bash", 0, 10, 0, 0, 0, 0, 
                    enemyVariable.getAttack() + 5, 100, 
                    1, // Assuming this is the areaOfEffectSize
                    10, // Assuming this is the areaOfEffectDamage
                    0, // duration
                    10, // criticalHitRate
                    "Physical", // elemental type
                    0, // elementalBoost
                    new ArrayList<>(), // statBuffArray
                    new ArrayList<>()); // buffAmountArray

                enemyVariable.learnMove(shieldBash);
                break;
            case "Boss":
                enemyVariable.setAttack(16);
                enemyVariable.setHealth(100);
                enemyVariable.setMaxHealth(100);
                enemyVariable.setHealthRegen(10);
                enemyVariable.setDefense(10);
                enemyVariable.setBlocking(10);
                enemyVariable.setMagic(10);
                enemyVariable.setResistance(10);
                enemyVariable.setMana(100);
                enemyVariable.setMaxMana(100);
                enemyVariable.setManaRegen(8);
                enemyVariable.setSpeed(13);
                enemyVariable.setStamina(100);
                enemyVariable.setMaxStamina(100);
                enemyVariable.setStaminaRegen(8);
                break;
        }
    }

    public static String randomName() {
        
        Random rand = new Random();

        String[] names = { "Zaroth", "Xylar", "Morgana", "Gideon", "Kaelith", 
        "Azrael", "Sylas", "Ravenna", "Thorneon", "Zephyrion", "Darianth", "Lyricus", 
        "Seraphiel", "Valerian", "Drystan", "Aetheron", "Calidian", "Morvain", 
        "Xandor", "Kaelith", "Galadrian", "Arionis", "Fenrisian", "Elowen", "Isoldeira", 
        "Selenea", "Seraphina", "Lyrielle", "Eveloria", "Thalassa", "Evadne", "Calista", 
        "Astridara", "Lirelia", "Vespera", "Sylvaria", "Fiorana", "Elaraia", "Vorin", 
        "Zephyros", "Elysium", "Cassius", "Neria", "Theron", "Phaedra", "Zephyros", 
        "Solarius", "Isolde", "Eldritch", "Aeliana", "Tyrion", "Eowyn", "Valthor", 
        "Azura", "Veridia", "Eldrion", "Alaric", "Aric", "Eirian", "Lethalos", "Nyx", 
        "Maelis", "Althran", "Freyja", "Elarion", "Althaea", "Veridian", "Nymeria", 
        "Faerion", "Zyraxes", "Xylo", "Thalassia", "Caelum", "Eiriana", "Valeria", 
        "Eolande", "Zephyrine", "Althor", "Lysandra", "Draven", "Eloweth", "Myrrh", 
        "Kylian", "Sorana", "Aroth", "Zephyria", "Eolias", "Aeria", "Varian", "Elyndor", 
        "Illyria", "Celadon", "Elliana", "Xylon", "Sorana", "Veridia", "Elarion", 
        "Althaea", "Zyraxes", "Lysandra", "Myrrh", "Varian", "Eolias", "Thalassia", 
        "Eirian", "Celadon", "Faerion", "Elaria", "Zephyra", "Elysium", "Aetherius", 
        "Azura", "Elaraia", "Xylo", "Nymeria", "Valerian", "Vespera", "Zephyrine", 
        "Vorin", "Isolde", "Alaric", "Theron", "Lirelia", "Kaelith", "Aroth", "Morvain", 
        "Aeliana", "Calista", "Arionis", "Faerion", "Selenea", "Kylian", "Zephyros", 
        "Eowyn", "Drystan", "Thorneon", "Valthor", "Xandor", "Eiriana", "Aroth", "Lyricus", 
        "Zephyria", "Eloweth", "Ravion", "Thalor", "Aeria", "Althor", "Valeria", "Nyx", 
        "Elliana", "Xylon", "Sorana", "Veridia", "Elarion", "Althaea", "Zyraxes", "Lysandra", 
        "Myrrh", "Varian", "Eolias", "Thalassia", "Eirian", "Celadon", "Faerion", "Elaria",
         "Zephyra", "Elysium", "Aetherius", "Azura", "Elaraia", "Xylo", "Nymeria", 
         "Valerian", "Vespera", "Zephyrine", "Vorin", "Isolde", "Alaric", "Theron", "Lirelia", 
         "Kaelith", "Aroth", "Morvain", "Aeliana", "Calista", "Arionis", "Faerion", "Selenea", 
         "Kylian", "Zephyros", "Eowyn", "Drystan", "Thorneon", "Valthor", "Xandor", "Eiriana", 
         "Aroth", "Lyricus", "Zephyria", "Eloweth", "Ravion", "Thalor", "Aeria", "Althor", 
         "Valeria", "Nyx", "Elliana", "Xylon", "Sorana", "Veridia", "Elarion", "Althaea", 
         "Zyraxes", "Lysandra", "Myrrh", "Varian", "Eolias", "Thalassia", "Eirian", "Celadon", 
         "Faerion", "Elaria", "Zephyra", "Elysium", "Aetherius", "Azura", "Elaraia", "Xylo", 
         "Nymeria", "Valerian", "Vespera", "Zephyrine", "Vorin", "Isolde", "Alaric", "Theron", 
         "Lirelia", "Kaelith", "Aroth", "Morvain", "Aeliana", "Calista", "Arionis", "Faerion", 
         "Selenea", "Kylian", "Zephyros", "Eowyn", "Drystan", "Thorneon", "Valthor", "Xandor", 
         "Eiriana", "Aroth", "Lyricus", "Zephyria", "Eloweth", "Ravion", "Thalor", "Aeria", 
         "Althor", "Valeria", "Nyx", "Elliana", "Xylon", "Sorana", "Veridia", "Elarion", 
         "Althaea", "Zyraxes", "Lysandra", "Myrrh", "Varian", "Eolias", "Thalassia", "Eirian", 
         "Celadon", "Faerion", "Elaria", "Zephyra", "Elysium", "Aetherius", "Azura", "Elaraia", 
         "Xylo", "Nymeria", "Valerian", "Vespera", "Zephyrine", "Vorin", "Isolde", "Alaric", 
         "Theron", "Lirelia", "Kaelith", "Aroth", "Morvain", "Aeliana", "Calista", "Arionis", 
         "Faerion", "Selenea", "Kylian", "Zephyros", "Eowyn", "Drystan", "Thorneon", "Valthor", 
         "Xandor", "Eiriana", "Aroth", "Lyricus", "Zephyria", "Eloweth", "Ravion", "Thalor", 
         "Aeria", "Althor", "Valeria", "Nyx", "Elliana", "Xylon", "Sorana", "Veridia", "Elarion", 
         "Althaea", "Zyraxes", "Lysandra", "Myrrh", "Varian", "Eolias", "Thalassia", "Eirian", 
         "Celadon", "Faerion", "Elaria", "Zephyra", "Elysium", "Aetherius", "Azura", "Elaraia", 
         "Xylo", "Nymeria", "Valerian", "Vespera", "Zephyrine", "Vorin", "Isolde", "Alaric", 
         "Theron", "Lirelia", "Kaelith", "Aroth", "Morvain", "Aeliana", "Calista", "Arionis", 
         "Faerion", "Selenea", "Kylian", "Zephyros", "Eowyn", "Drystan", "Thorneon", "Valthor", 
         "Xandor", "Eiriana", "Aroth", "Lyricus", "Zephyria", "Eloweth", "Ravion", "Thalor", "Aeria", 
         "Althor", "Valeria", "Nyx", "Elliana", "Xylon", "Sorana", "Veridia", "Elarion", "Althaea", 
         "Zyraxes", "Lysandra", "Myrrh", "Varian", "Eolias", "Thalassia", "Eirian", "Celadon", 
         "Faerion", "Elaria", "Zephyra" };
    
        return names[rand.nextInt(names.length)];
    }

     public static String randomType() {
        
        Random rand = new Random();

        String[] types = { "Bat", "Skeleton", "Armored Skeleton" };
    
        return types[rand.nextInt(types.length)];
    }

    

}

