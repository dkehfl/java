package CH_220522;
public class Over {
    public static void main(String[] args) {
        Over t = new Over();
        t.num();
        t.num(1);
        t.num(2,3);
    }

    public void num() {
        System.out.println("sja");
    }
    public void num(int a) {
        System.out.println(a);
    }
    public void num(int a, int b) {
        System.out.println(a + b);
    }
    }

