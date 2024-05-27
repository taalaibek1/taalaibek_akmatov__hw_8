package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
         final int ATTACK_INCREMENT = 5;

        for (int i=0; i< heroes.length; i++) {
            if (heroes[i] != this && !(heroes[i] instanceof Hacker)) {
                heroes[i].setDamage(heroes[i].getDamage() + ATTACK_INCREMENT);
            }
        }


        

    }
}
