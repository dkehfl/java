package CH_220703;
class MyCheckedException extends Exception{

    public MyCheckedException(String message) {
        super(message);
    }
}

public class CheckedAndUnChecked {
    public static void main(String[] args) {
        try {
            throw new MyCheckedException("커스텀한 예외입니다.");
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
    }
}