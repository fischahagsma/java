package pokemons;

import moves.emolga.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Emolga extends Pokemon {
    public Emolga(String name, int level) {
        super(name, level);
        super.setType(Type.ELECTRIC, Type.FLYING);
        super.setStats(55, 75, 60,75,60, 103);
        Facade facade = new Facade(70, 100);
        Tickle tickle = new Tickle(0, 100);
        ChargeBeam chargeBeam = new ChargeBeam(50, 90);
        IronTail ironTail = new IronTail(100, 75);
        super.setMove(facade, tickle, chargeBeam, ironTail);
    }
}
