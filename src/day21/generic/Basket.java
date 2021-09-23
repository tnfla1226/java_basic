package day21.generic;

public class Basket<F extends Fruit> {

    private F f;

    public void setF(F f) {
        this.f = f;
    }

    public F getF() {
        return f;
    }
}
