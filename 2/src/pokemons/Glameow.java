package pokemons;

import moves.glameow.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Glameow extends Pokemon {
    public Glameow(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(49, 55, 42, 42, 37, 85);
        Scratch scratch = new Scratch(40, 100);
        DreamEater dreamEater = new DreamEater(100, 100);
        AerialAce aerialAce = new AerialAce(60, 0);
        super.setMove(scratch, dreamEater, aerialAce);
    }


}
