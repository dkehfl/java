package CH_220821;


public class Computer {
    int size;       // 크기
    String color;   // 색깔
    String brand;   // 브랜드
    boolean power;  // 전원 상태

    int volumeUp(int basic) {
        int result = basic;
        result++;
        return result;
    }

    int volumeDown(int basic) {
        int result = basic;
        result--;
        return result;
    }
    public static void main(String[] args) {
        Computer c = new Computer();
        c.size = 100;
        c.color = "white";
        c.brand = "Samsung";
        c.power = true;

        c.volumeUp(10);
        c.volumeDown(11);
    }
}