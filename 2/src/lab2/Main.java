package lab2;

import ru.ifmo.se.pokemon.*;
import pokemons.*;

/*
485993
 */


public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
//        Glameow p1 = new Glameow("glameow", 1);
//        Purugly p2 = new Purugly("purugly", 1);
//        Emolga p3 = new Emolga("emolga", 1);
        Seedot p4 = new Seedot("seedot", 1);
        Nuzleaf p5 = new Nuzleaf("nuzleaf", 1);
        Shiftry p6 = new Shiftry("shiftry", 1);
        Pokemon[] Ally = {new Glameow("glameow", 1), new Purugly("purugly", 1), new Emolga("emolga", 1)};
        for (Pokemon p : Ally) {
            b.addAlly(p);
        }

//        b.addAlly(p1);
//        b.addAlly(p2);
//        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
