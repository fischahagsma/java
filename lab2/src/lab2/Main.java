package lab2;
import ru.ifmo.se.pokemon.*;
import pokemons.*;

/*
485993
 */


public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Glameow("glameow", 1);
        Pokemon p2 = new Purugly("purugly", 1);
        Pokemon p3 = new Emolga("emolga", 1);
        Pokemon p4 = new Seedot("seedot", 1);
        Pokemon p5 = new Nuzleaf("nuzleaf", 1);
        Pokemon p6 = new Shiftry("shiftry", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
//        Pokemon[] pokemons = new Pokemon[] {p1,p2,p3,p4,p5,p6};
//        for (Pokemon c: pokemons){
//            System.out.println(c);
//        }
    }
}
