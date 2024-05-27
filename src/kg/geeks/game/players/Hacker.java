package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Hacker extends Hero{
    private int transferHealth = 20;

    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.TRANSFER_HEALTH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int randomHeroIndex = RPG_Game.random.nextInt(heroes.length);
        Hero randomHero = heroes[randomHeroIndex];


    if(randomHero!=this && RPG_Game.getRoundNumber()%2==0 ){
        randomHero.setHealth(randomHero.getHealth() + transferHealth);
        System.out.println(getName() + " transferred " + transferHealth + " health to " + randomHero.getName());
    }


    }


    public int getTransferHealth() {
        return transferHealth;
    }

    public void setTransferHealth(int transferHealth) {
        this.transferHealth = transferHealth;
    }
}
