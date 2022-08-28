package CH_220814;
public class Circle {
    public double radius; // 필드(==인스턴스)변수 선언
    final double pi = 3.141592;// 1. 원주율 final로 생성하기

    public Circle(double radius) {
        this.radius = radius;
    }// 2. radius를 받는 생성자 구현

    // 기능 구현
    public double getArea() {
        new Circle(10);
        return radius * radius * pi;
        // 3. 원의 면적을 구하는 공식 반지름*반지름*파이
    }
}
