package moves.glameow;

import ru.ifmo.se.pokemon.*;

public final class DreamEater extends SpecialMove {
    public DreamEater(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if (def.getCondition() == Status.SLEEP) {
            super.applyOppDamage(def, damage);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        p.setMod(Stat.HP, + (int) ((p.getStat(Stat.HP) - p.getHP()) * 0.5));
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length-1];
    }
}
