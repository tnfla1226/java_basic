package day17.abs;

public abstract class Car {

    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    //주행기능
    //추상 메서드
    public abstract void start();
//    public abstract void engineBreak();

    public void seatHeater() {
        System.out.println("시트 열선 기능을 가동합니다.");
    }

    public final void powerHandle() {
        System.out.println("파워핸들 기능!");
    }
}
