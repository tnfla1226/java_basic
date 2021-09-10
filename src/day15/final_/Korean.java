package day15.final_;

public class Korean {

    String name; //이름

    //상수는 불변해야 하며 공유되어야 함.
    static final String NATION; //국적
    final String sid; //주민번호    //final은 변경불가

    static {
        NATION = "대한민국";
    }

    public Korean(String name, String sid) {
        this.name = name;
        this.sid = sid;
    }

    public static void main(String[] args) {

        Korean park = new Korean("박영희", "911111-1234567");
        park.name = "박찬호";
//        park.nation = "대한민국";

        Korean kim = new Korean("김철수", "881111-2121212");

    }
}
