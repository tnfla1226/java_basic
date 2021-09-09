package day14.inherit.player;

public class Mage extends Player {

    int mana;

    public Mage(String nickName, int level, int hp, int mana) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.mana = mana;
    }

    public void info() {
        super.info();
        System.out.println("# 마력: " + mana);
    }

    public void meteor() {

    }
}
