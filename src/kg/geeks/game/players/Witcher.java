package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name ) {
        super(health, damage, name, SuperAbility.SACRIFICE);
    }



    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for(int i=1; i<heroes.length; i++){
            if(heroes[i].getHealth()<=0){
               heroes[i].setHealth(heroes[i].getHealth()+this.getHealth());
                this.setHealth(0);
                System.out.println("Geralt sacrificed hiimself to " + heroes[i].getName());
               break;
            }
        }
    }
}
