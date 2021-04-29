package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {
    protected int életErő = 50;
    protected int támadásiSebzés = 20;
    protected boolean vanPáncél = false;

    @Override
    public int getHitPoints() {
        return életErő;
    }

    @Override
    protected int doDamage() {
        return támadásiSebzés;
    }

    @Override
    protected void sufferDamage(int damage) {
        életErő -= damage;
    }
}