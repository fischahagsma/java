package moves.emolga;

import ru.ifmo.se.pokemon.*;

public final class Tickle extends StatusMove {
    public Tickle(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect();
        e.stat(Stat.ATTACK, -1);
        e.stat(Stat.DEFENSE, -1);
        p.addEffect(e);
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
