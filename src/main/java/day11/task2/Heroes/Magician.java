package day11.task2.Heroes;

import day11.task2.Interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {



    public Magician(){
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }



    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
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


