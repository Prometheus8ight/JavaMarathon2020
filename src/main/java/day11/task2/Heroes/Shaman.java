package day11.task2.Heroes;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements MagicAttack, Healer {


    static final int HEAL_AMOUNT = 50;
    static final int HEAL_TEAMMATE = 30;

    public Shaman(){
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
        magicAtt = 15;
    }

    @Override
    public String toString() {
        return "Shaman{" +
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

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt * (1 - hero.magicDef);
        if(hero.health - attackScore < MIN_HP){
            hero.health = MIN_HP;
        }else {
            hero.health -= attackScore;
        }
    }
}
