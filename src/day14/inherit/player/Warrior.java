package day14.inherit.player;

//상위클래스로부터 상속받은 클래스를 자식, 하위클래스(sub class)
public class Warrior extends Player {

    int rage;

    public Warrior() {
//        super();  부모의 기본 생성자를 부름. 생략되어있음
        System.out.println("전사 객체 생성!");
    }

    public Warrior(String nickName, int level, int hp, int rage) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.rage = rage;
    }

    @Override
    public void info() {    //오버라이딩 //자식의 접근제한자는 부모보다 더 public하게(more public)
        /*System.out.println("\n========== Warrior info ==========");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);*/
        super.info();
        System.out.println("# 분노: " + rage);

    }

    public void fireSlash() {

    }
}
