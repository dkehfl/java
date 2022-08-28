package CH_220703;

public class Exception02 {
    public static void main(String[] args) {
        String a = null;
        int[] scores = {1,2,3};
        try {
            System.out.println(a.length());
            System.out.println(scores[3]);
        } catch(ArithmeticException e){
            System.out.println("계산 잘못됨");
        } catch (NullPointerException e) {
            System.out.println("문자열 잘못됨");
        } catch(Exception e){
            System.out.println("잘못됨");
        }
    }
}
