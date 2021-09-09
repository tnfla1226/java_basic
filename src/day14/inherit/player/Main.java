package day14.inherit.player;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior();
        w.nickName = "전사왕파괴신";
        w.level = 5;
        w.hp = 100;
        w.rage = 60;

        w.fireSlash();
        w.info();

        Mage m = new Mage();
        m.nickName = "눈보라왕";
        m.level = 4;
        m.hp = 84;
        m.mana = 150;

        m.meteor();
        m.info();

    }
}
