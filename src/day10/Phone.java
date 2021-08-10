package day10;

//설계도 클래스는 main을 만들지 않습니다.
public class Phone {

    //속성: 객체의 데이터
    //필드(field)
    String model; //모델명
    String color; //색상
    int price; //가격
    String[] receiveMessage; //받은 문자메시지들
    int messageCount; //총 문자메시지 수
    boolean isOn; //전원 켜진 여부

    //생성자(constructor)
    //객첼를 생성하고 초기화를 담당
    Phone() {   //생성자는 리턴을 하지 않기 때문에 void 조차 쓰지 않음
        model = "갤럭시 Z-Fold2";
        color = "펄 블루";
        price = 3000000;
        isOn = true;
    }
    //생성자는 여러 개 선언할 수 있음(오버로딩)
    Phone(String modelName) {
        model = modelName;
        color = "스노우 화이트";
        price = 1200000;
        isOn = true;
    }
    Phone(String modelName, String colorName) {
        model = modelName;
        color = colorName;
        price = 1400000;
        isOn = true;
    }


    //기능: 객체의 행위
    //메서드(method): static은 붙이지 마세요.

    //전원 켜는 기능
    void powerOn() {
        isOn = true;
        System.out.println(model + "의 전원을 켭니다.");
    }
    //전원 끄는 기능
    void powerOff() {
        isOn = false;
        System.out.println(model + "의 전원을 끕니다.");
    }
    //핸드폰의 정보를 보여주는 기능
    void showSpec() {
        if (!isOn) {
            System.out.println("전원을 먼저 켜세요~");
            return;
        }
        System.out.println("\n### 휴대폰 정보 ###");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price + "원");
    }

}
