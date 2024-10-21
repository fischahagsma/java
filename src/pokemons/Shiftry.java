package pokemons;

import moves.Nuzleaf.Extrasensory;
import moves.seedot.Rest;
import moves.seedot.SwordsDance;
import ru.ifmo.se.pokemon.Type;

public final class Shiftry extends Nuzleaf{
    public Shiftry(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS, Type.DARK);
        super.setStats(90, 100, 60, 90, 60, 80);
        Rest rest = new Rest(0 ,0);
        SwordsDance swordsDance = new SwordsDance(0, 0);
        Extrasensory extrasensory = new Extrasensory(80, 100);
        super.setMove(rest, swordsDance, extrasensory, rest);
    }
}
