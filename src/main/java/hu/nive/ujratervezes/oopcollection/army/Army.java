package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Army {
    List<MilitaryUnit> hadsereg = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        hadsereg.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (int i = 0; i <= hadsereg.size(); i++) {
            hadsereg.get(i).sufferDamage(damage);
            if (hadsereg.get(i).getHitPoints() < 25) {
                hadsereg.remove(i);
            }
        }
    }

    public int getArmyDamage() {
        int totalDamage = 0;
        for (int i = 0; i < hadsereg.size(); i++) {
            totalDamage += hadsereg.get(i).doDamage();
        }
        return totalDamage;
    }

    public int getArmySize() {
        return hadsereg.size();
    }
}