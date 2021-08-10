package day10;

//실행용 클래스(객체를 생성해서 사용하는 곳)에 main을 만듭니다.
public class PhoneFactory {

    public static void main(String[] args) {

        //객체의 생성
        Phone galaxyS21 = new Phone();  //galaxyS21는 Phone타입으로 메모리가 작기때문에 new로 주소를 할당해서? 저장
        System.out.println("galaxyS21 = " + galaxyS21);

        //객체의 속성과 기능 참조: 참조연산자 . 을 사용
        /*
        galaxyS21.model = "갤럭시S21";
        galaxyS21.color = "크롬블랙";
        galaxyS21.price = 1000000;

        galaxyS21.powerOn();
        */
        galaxyS21.showSpec();

        System.out.println("=================================");

        Phone iPhoneX = new Phone("아이폰X");
        /*
        iPhoneX.model = "아이폰X";
        iPhoneX.color = "스노우 화이트";
        iPhoneX.price = 1200000;

        iPhoneX.powerOn();
        */
        iPhoneX.showSpec();

        System.out.println("=================================");

        Phone lgV6 = new Phone("LG V6", "에메랄드 그린");
        lgV6.showSpec();

    }
}
