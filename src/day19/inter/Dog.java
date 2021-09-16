package day19.inter;

public class Dog extends Animal implements Pet, Violent {

    @Override
    public void play() {
        System.out.println("강아지는 뛰면서 놀아요~");
    }

    @Override
    public void hunt(String target) {

    }

    @Override
    public void attack() {

    }
}
