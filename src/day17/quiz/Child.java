package day17.quiz;

public class Child extends Parent {
    public Child(String name) {
        super(name);    //기본 생성자가 없어서 에러
        this.name = name;
    }
}
