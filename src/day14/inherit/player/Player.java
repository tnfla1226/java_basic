package day14.inherit.player;

//공통 기능과 속성을 가진 클래스를 부모, 상위 클래스(super class)라고 부름.
public class Player extends Object {

    //공통 속성
    public String nickName;
    public int level;
    public int hp;

    //생성자
    public Player() {
        System.out.println("부모 객체 Player 생성!");
    }

    public Player(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    //공통 기능
    public void info() {
        System.out.println("\n========== 캐릭터 info ===========");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }
}
