package pokemons;

import moves.Nuzleaf.Extrasensory;
import moves.seedot.Rest;
import moves.seedot.SwordsDance;
import ru.ifmo.se.pokemon.Type;

public class Nuzleaf extends Seedot{
    public Nuzleaf(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS, Type.DARK);
        super.setStats(70, 70, 40, 60, 40, 60);
        Rest rest = new Rest(0 ,0);
        SwordsDance swordsDance = new SwordsDance(0, 0);
        Extrasensory extrasensory = new Extrasensory(80, 100);
        super.setMove(rest, swordsDance, extrasensory);
    }
}
