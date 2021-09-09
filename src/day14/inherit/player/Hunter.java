package day14.inherit.player;

public class Hunter extends Player {

    String beast;

    public Hunter() {
    }

    public Hunter(String nickName, int level, int hp, String beast) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.beast = beast;
    }

    public void info() {
        super.info();
        System.out.println("# 동물: " + beast);
    }

    public void thunderShot() {

    }
}
