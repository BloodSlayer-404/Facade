package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    LinkFacade facade = new LinkFacade();

    /**
     * Checks that all the methods of the Puzzle class work fine in the LinkFacade
     */
    @Test
    void puzzleTest(){
        assertEquals("Link solves the puzzle with his incredible mind in 27 seconds", facade.solvePuzzle(27));
    }

    /**
     * Checks that all the methods of the Combat class work fine in the LinkFacade
     */
    @Test
    void combatTest(){
        assertEquals("1. Link attacks a Moblin\n" +
                        "2. Link attacks a Moblin\n" +
                        "3. Link attacks a Moblin\n",
                facade.onlyAttack(3, "Moblin"));

        assertEquals("1. Link blocks an attack from the Bokoblin\n" +
                        "2. Link blocks an attack from the Bokoblin\n",
                facade.onlyDefense(2, "Bokoblin"));

        assertEquals("1. Link attacks a Chuchu\n" +
                        "2. Link blocks an attack from the Chuchu\n" +
                        "3. Link attacks a Chuchu\n" +
                        "4. Link blocks an attack from the Chuchu\n",
                facade.attackAndDefense(4, "Chuchu"));
    }

    /**
     * Checks that all the methods of the Inventory class work fine in the LinkFacade
     */
    @Test
    void inventoryTest(){
        assertEquals("Link gets a Bow and puts it in his inventory",
                facade.getItem("Bow"));

        facade.getItem("Potion");
        facade.getItem("Potion");
        facade.getItem("Potion");
        facade.getItem("Master Sword");

        assertEquals("Link uses the Potion that he has in his inventory",
                facade.useItem("Potion"));

        assertEquals("Link did not have a Mega Rupia in his inventory",
                facade.useItem("Mega Rupia"));

        assertEquals("1. Link uses the Bow that he has in his inventory\n" +
                        "2. Link uses the Potion that he has in his inventory\n" +
                        "3. Link uses the Potion that he has in his inventory\n" +
                        "4. Link uses the Master Sword that he has in his inventory\n",
                facade.useAllItems());
    }
}