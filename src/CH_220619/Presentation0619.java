package CH_220619;

public class Presentation0619 {
    private int height;     // 필드값을 private로 선언
    private boolean tall;

    public void setHeight(int height) {     // setter 메소드를 public으로 선언
        if (height < 0) {
            this.height = 0;
            return;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {     // getter 메소드를 public으로 선언
        double meter = height / 100;
        return meter;
    }

    public static void main(String[] args) {
        Presentation0619 CH = new Presentation0619();
        CH.setHeight(160);
        System.out.println("채은이의 키는 " + CH.getHeight());
    }
}
