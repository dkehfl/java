package CH_220626;

public class CustomException extends ArrayIndexOutOfBoundsException{    //
    private String message;

            CustomException(String message) {       // 생성자
                super(message);     // super: 조상. 부모 소환
            }
}
