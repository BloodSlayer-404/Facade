package org.example;

public class Combat {

    /**
     * Attack the specified enemy
     * @param enemy: The enemy to attack
     * @return "Link attacks a enemy"
     */
    String attack(String enemy){
        return "Link attacks a " + enemy;
    }

    /**
     * Blocks an attack from the specified enemy
     * @param enemy: The enemy who is attacking Link
     * @return "Link blocks an attack from the enemy"
     */
    String defense(String enemy){
        return "Link blocks an attack from the " + enemy;
    }
}
