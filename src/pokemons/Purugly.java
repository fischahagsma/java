package pokemons;

import moves.glameow.AerialAce;
import moves.glameow.DreamEater;
import moves.glameow.Scratch;
import moves.purugly.Bulldoze;
import ru.ifmo.se.pokemon.Type;

public final class Purugly extends Glameow{
    public Purugly(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        super.setStats(71, 82, 64, 64, 59, 112);
        Scratch scratch = new Scratch(40, 100);
        DreamEater dreamEater = new DreamEater(100, 100);
        AerialAce aerialAce = new AerialAce(60, 0);
        Bulldoze bulldoze = new Bulldoze(60, 100);
        super.setMove(scratch, dreamEater, aerialAce, bulldoze);
    }

}
