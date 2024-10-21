package pokemons;

import moves.seedot.Rest;
import moves.seedot.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seedot extends Pokemon {
    public Seedot(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(40, 40, 50, 30, 30, 30);
        Rest rest = new Rest(0 ,0);
        SwordsDance swordsDance = new SwordsDance(0, 0);
        super.setMove(rest, swordsDance);
    }
}
