package day17.abs;

public class Santafe extends Car {
    public Santafe(String model, int price) {
        super(model, price);
    }

    @Override
    public void start() {
        System.out.println("산타페가 달립니다.");
    }

    @Override
    public void seatHeater() {
        System.out.println("산타페의 시트 열선 기능!");
    }
}
