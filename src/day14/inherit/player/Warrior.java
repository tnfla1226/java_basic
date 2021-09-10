package day14.inherit.player;

//상위클래스로부터 상속받은 클래스를 자식, 하위클래스(sub class)
public class Warrior extends Player {

    int rage;

    public Warrior() {
        super();
        System.out.println("전사 객체 생성!");
    }

    public Warrior(String nickName, int level, int hp, int rage) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.rage = rage;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 분노: " + rage);
    }

    public void fireSlash() {

    }
}
