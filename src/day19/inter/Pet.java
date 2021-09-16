package day19.inter;

public interface Pet {

    //상수(static final)
    int AAA = 10;

    //추상메서드
    public abstract void play();    //인터페이스는 디폴트가 추상메서드

    default void eat() {    //일반메서드처럼 쓰다가 어느정도 선언됐으면 추상클래스로 변경

    }
}
