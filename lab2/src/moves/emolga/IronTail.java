package moves.emolga;

import ru.ifmo.se.pokemon.*;

public final class IronTail extends PhysicalMove {
    public IronTail(double pow, double acc) {
        super(Type.STEEL, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.3).stat(Stat.DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        this.
        return "does " + pieces[pieces.length-1];
    }
}
