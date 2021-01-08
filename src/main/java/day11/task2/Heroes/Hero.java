package day11.task2.Heroes;

import day11.task2.Interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    int health;
    double physDef;
    double magicDef;
    int physAtt;
    int magicAtt;
    final int MAX_HP = 100;
    final int MIN_HP = 0;


    public Hero(){
    health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAtt * (1 - hero.physDef);
        if(hero.health - attackScore < MIN_HP){
            hero.health = MIN_HP;
        }else {
            hero.health -= attackScore;
        }
    }
}
