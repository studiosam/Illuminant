import java.util.ArrayList;

public class Room {
     // Room properties
     String name;
     String description;
     String elemental;
     int elementalPower;

     // Room interactables
     Room[] connectedRooms;
     Items[] availableItems;
     Items[] hiddenItems;
     String[] obstacles;
     String[] triggers;


     // Characters in the room
     Character[] enemies;
     Character[] npcs;

     // Room stat buffs and debuffs
     ArrayList<String> statsToBuff;
     ArrayList<Integer> statsBuffAmounts; 
     ArrayList<String> statsToDebuff;
     ArrayList<Integer> statsDebuffAmounts;
     
     // Constructor
     public Room(String name, String description, String elemental, int elementalPower,
                 Room[] connectedRooms, Items[] availableItems, Items[] hiddenItems,
                 String[] obstacles, String[] triggers, Character[] enemies, Character[] npcs,
                 ArrayList<String> statsToBuff, ArrayList<Integer> statsBuffAmounts,
                 ArrayList<String> statsToDebuff, ArrayList<Integer> statsDebuffAmounts) {
         this.name = name;
         this.description = description;
         this.elemental = elemental;
         this.elementalPower = elementalPower;
         this.connectedRooms = connectedRooms;
         this.availableItems = availableItems;
         this.hiddenItems = hiddenItems;
         this.obstacles = obstacles;
         this.triggers = triggers;
         this.enemies = enemies;
         this.npcs = npcs;
         this.statsToBuff = statsToBuff;
         this.statsBuffAmounts = statsBuffAmounts;
         this.statsToDebuff = statsToDebuff;
         this.statsDebuffAmounts = statsDebuffAmounts;
     }

     // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getElemental() { return elemental; }
    public int getElementalPower() { return elementalPower; }
    public Room[] getConnectedRooms() { return connectedRooms; }
    public Items[] getAvailableItems() { return availableItems; }
    public Items[] getHiddenItems() { return hiddenItems; }
    public String[] getObstacles() { return obstacles; }
    public String[] getTriggers() { return triggers; }
    public Character[] getEnemies() { return enemies; }
    public Character[] getNpcs() { return npcs; }
    public ArrayList<String> getStatsToBuff() { return statsToBuff; }
    public ArrayList<Integer> getStatsBuffAmounts() { return statsBuffAmounts; }
    public ArrayList<String> getStatsToDebuff() { return statsToDebuff; }
    public ArrayList<Integer> getStatsDebuffAmounts() { return statsDebuffAmounts; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setElemental(String elemental) { this.elemental = elemental; }
    public void setElementalPower(int elementalPower) { this.elementalPower = elementalPower; }
    public void setConnectedRooms(Room[] connectedRooms) { this.connectedRooms = connectedRooms; }
    public void setAvailableItems(Items[] availableItems) { this.availableItems = availableItems; }
    public void setHiddenItems(Items[] hiddenItems) { this.hiddenItems = hiddenItems; }
    public void setObstacles(String[] obstacles) { this.obstacles = obstacles; }
    public void setTriggers(String[] triggers) { this.triggers = triggers; }
    public void setEnemies(Character[] enemies) { this.enemies = enemies; }
    public void setNpcs(Character[] npcs) { this.npcs = npcs; }
    public void setStatsToBuff(ArrayList<String> statsToBuff) { this.statsToBuff = statsToBuff; }
    public void setStatsBuffAmounts(ArrayList<Integer> statsBuffAmounts) { this.statsBuffAmounts = statsBuffAmounts; }
    public void setStatsToDebuff(ArrayList<String> statsToDebuff) { this.statsToDebuff = statsToDebuff; }
    public void setStatsDebuffAmounts(ArrayList<Integer> statsDebuffAmounts) { this.statsDebuffAmounts = statsDebuffAmounts; }
}
