package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{
    protected int életErő = 100;
    protected int támadásiSebzés = 10;
    protected boolean vanPáncél;
    protected boolean vanPajzsa = true;

    public Swordsman(boolean vanPáncél) {
        this.vanPáncél = vanPáncél;
    }

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
        if (vanPajzsa) {
            vanPajzsa = false;
        } else if (vanPáncél) {
            életErő -= (damage / 2);
        } else {
            életErő -= damage;
        }
    }

}