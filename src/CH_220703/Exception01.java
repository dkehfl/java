package CH_220703;

public class Exception01 {
    String a;
    public String getA() {
        return a;
    }
    public static void main(String[] args) {
        Exception01 test = new Exception01();

        try {
            if (test.getA().equals("tester")) {
                System.out.println("hello");
            }
        } catch(NullPointerException e) {
            System.out.println("null");
        } finally {
            System.out.println("마침내!");
        }
    }
}
