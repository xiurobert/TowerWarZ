package net.towerwarz.towers.GatlingGun;

/**
 * Created by xiurobert on 2/27/2015.
 */

public class GatlingGunLv3 {
    public String def = "MoreBarrels";
    public int
    int maxDmg = 8;
    int minDmg = 4;
    Random rand = new Random();
    public int GatlingGunLv3Dmg = rand.nextInt((maxDmg - minDmg) + 1) + minDmg;
    public double GatlingGunLv3SplashRadius = 0.01;
    public double GatlingGunLv3ReloadRate = 0.01;

    int spreadRadius=18
}
}
