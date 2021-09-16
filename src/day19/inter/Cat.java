package day19.inter;

public class Cat extends Animal implements Pet {

    @Override
    public void play() {
        System.out.println("고양이는 캣타워에서 놀아요~");
    }
}
