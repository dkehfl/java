package CH_220814;

public class Cylinder {

    Circle cir;
    double height;

    public Cylinder(Circle cir, double height) {
        this.cir = cir;
        this.height = height;
    }// 1. cir과 height를 받는 생성자를 작성하시오.

    public double Volum() {
        return cir.getArea() * height;
        // 2. // 반지름과 높이를 곱해서 리턴
    }

    public static void main(String[] args) {
        // 반지름이 2.8 , 높이가 5.6의 원통의 부피를 출력
        Circle cp = new Circle(2.8); // 반지름 2.8
        Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
        // Circle 생성자의 2.8, Cylinder 5.6
        double height = 5.6; // radius 2.8 height 5.6

        // 부피 구하는 법 : 원의 면적 * 높이 . >> 면적은 반지름+반지름+파이
        System.out.println("부피 : "+(cp.getArea()*height));
        System.out.println(cd.Volum()); // 동일한 결과

    }

}