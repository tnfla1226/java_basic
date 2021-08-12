package day12.player;

public class Player {

    String name;
    int level;
    int hp;

    public Player() {
        this("이름없음", 1);
        System.out.println("1번 생성자 호출!");
//        this.name = "이름없음";
//        this.level = 1;
//        this.hp = 50;
    }

    public Player(String name) {
        this(name, 1);  //나의 생성자 호출(3번 생성자)
        System.out.println("2번 생성자 호출!");
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
    }

    public Player(String name, int level) {
        System.out.println("3번 생성자 호출!");
        this.name = name;
        this.level = level;
        this.hp = 50;
    }

    void attack(Player target) {    //Player this라는 매개변수가 숨어있음

        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);

//        System.out.println("target의 주소: " + target);
//        System.out.println("this의 주소: " + this);
    }

    void info () {
        System.out.printf("이름: %s, 레벨: %d, 체력: %s\n", this.name, this.level, this.hp);
    }
}
