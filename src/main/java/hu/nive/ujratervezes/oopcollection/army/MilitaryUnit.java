package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    protected int életErő;
    protected int támadásiSebzés;
    protected boolean vanPáncél;

    public int getHitPoints() {
        return életErő;
    }

    protected int doDamage() {
        return támadásiSebzés;
    }

    protected void sufferDamage(int damage) {
        if (vanPáncél) {
            életErő -= (damage / 2);
        } else {
            életErő -= damage;
        }
    }
}
