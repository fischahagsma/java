package moves.glameow;

import ru.ifmo.se.pokemon.*;


public final class AerialAce extends PhysicalMove {
    public AerialAce(double pow, double acc) {
        super(Type.FLYING, pow, acc);
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
