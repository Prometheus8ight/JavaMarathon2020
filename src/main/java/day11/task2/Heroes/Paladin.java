package day11.task2.Heroes;

import day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements Healer {

    static final int HEAL_AMOUNT = 25;
    static final int HEAL_TEAMMATE = 10;

    public Paladin(){
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        if(health > MAX_HP){
            health = MAX_HP;
        }else {
            health += HEAL_AMOUNT;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + HEAL_TEAMMATE >= MAX_HP){
            hero.health = MAX_HP;
        }else {
            hero.health += HEAL_TEAMMATE;
        }
    }
}
