package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{
    protected int életErő = 150;
    protected int támadásiSebzés = 20;
    protected boolean vanPáncél = true;
    protected boolean voltRoham = false;

    @Override
    public int getHitPoints() {
        return életErő;
    }

    @Override
    protected int doDamage() {
        if (!voltRoham) {
            voltRoham = true;
            return támadásiSebzés * 3;
        }
        return támadásiSebzés;
    }

    @Override
    protected void sufferDamage(int damage) {
        if (vanPáncél) {
            életErő -= (damage / 2);
        } else {
            életErő -= damage;
        }
    }
}