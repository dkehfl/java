package CH_220522;

public class GenericEx2 {
    public GenericEx2() { // 생성자 직접 정의
        System.out.println("생성자 호출");
    }

    public static void main(String[] args) {
        GenericEx2 a = new GenericEx2(); // 인스턴스 생성, 생성자 호출
        System.out.println(a);
    }
}
