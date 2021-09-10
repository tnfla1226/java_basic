package day14.inherit.player;

public class Mage extends Player {

    int mana;

    public Mage() {

    }
    public Mage(String nickName, int level, int hp, int mana) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.mana = mana;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 마력: " + mana);
    }

    public void meteor() {

    }
}
