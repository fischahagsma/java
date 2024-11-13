package moves.seedot;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.HP, - (int) (p.getStat(Stat.HP) - p.getHP()));
        Effect e1 = new Effect().turns(2).condition(Status.SLEEP);
        p.setCondition(e1);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
