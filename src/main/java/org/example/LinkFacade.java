package org.example;

import java.util.List;

public class LinkFacade {

    private Combat figth = new Combat();
    private Inventory inventory = new Inventory();
    private Puzzle puzzle = new Puzzle();

    /**
     * A fight in which Link only will attack the enemy
     * @param turns: The turns that the combat will last
     * @param enemy: The enemy that will be fighted
     * @return The combat log of the fight
     */
    public String onlyAttack(int turns, String enemy){
        String combatLog = "";

        for (int i = 1; i<=turns; i++){
            combatLog = combatLog.concat(i+". "+figth.attack(enemy)+"\n");
        }

        return combatLog;
    }

    /**
     * A fight in which Link will attack an enemy and defend from him
     * @param turns: The turns that the combat will last
     * @param enemy: The enemy that will be fighted
     * @return The combat log of the fight
     */
    public String attackAndDefense(int turns, String enemy){
        String combatLog = "";

        for (int i = 1; i<=turns; i++){
            combatLog = combatLog.concat(i+". "+figth.attack(enemy) + "\n");

            if (i<=turns) {
                i++;
                combatLog = combatLog.concat(i + ". " + figth.defense(enemy) + "\n");
            }
        }

        return combatLog;
    }

    /**
     * A fight in which Link only will defend himself from an enemy
     * @param turns: The turns that the combat will last
     * @param enemy: The enemy that will be fighted
     * @return The combat log of the fight
     */
    public String onlyDefense(int turns, String enemy){
        String combatLog = "";

        for (int i = 1; i<=turns; i++){
            combatLog = combatLog.concat(i+". "+figth.defense(enemy) + "\n");
        }

        return combatLog;
    }

    /**
     * Put an item inside Link's inventory
     * @param item: The item to be added in the inventory
     * @return "Link gets an item and puts it in his inventory"
     */
    public String getItem(String item){
        return inventory.getItem(item);
    }

    /**
     * Indicates Link to use an item
     * @param item: The item to be used from the inventory
     * @return A text describing if Link can use the item or not
     */
    public String useItem(String item){
        return inventory.useItem(item);
    }

    /**
     * Indicates Link to use all the items that he has in his inventory
     * @return A string of the items used
     */
    public String useAllItems(){
        List<String> items = inventory.getItems();
        String itemsUsed = "";
        int count = 1;

        while (!inventory.getItems().isEmpty()){
            itemsUsed = itemsUsed.concat(count + ". " +
                    inventory.useItem(
                            inventory.getItems().getFirst()
                    )
             + "\n");
            count++;
        }
        return itemsUsed;
    }

    /**
     * Link solves a puzzle in the indicated time
     * @param seconds: The time that takes to Link solve the puzzle
     * @return A phrase that says that Link solve the puzzle in the indicated time
     */
    public String solvePuzzle(int seconds){
        return puzzle.solvePuzzle() + " in " + seconds + " seconds";
    }

}
