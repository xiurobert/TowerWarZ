package net.towerwarz.mobs;

import net.towerwarz.MobStatus;

/**
 * Created by Way Yan on 3/25/2016.
 */
public abstract class Fighter {
    private String def;
    private int mobDataId;
    private int hp;
    private int moveSpeed;

    public Fighter() {

    }

    public Fighter(String def, int mobDataId, int hp, int moveSpeed) {
        this.def = def;
        this.mobDataId = mobDataId;
        this.hp = hp;
        this.moveSpeed = moveSpeed;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public int getMobDataId() {
        return mobDataId;
    }

    public void setMobDataId(int mobDataId) {
        this.mobDataId = mobDataId;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public abstract MobStatus attack(Enemy other);
}
