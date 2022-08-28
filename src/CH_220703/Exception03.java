package CH_220703;
import java.util.Scanner;
import java.io.IOException;

public class Exception03 {
    String pw = "";

    public void setPw(String pw) throws IOException {
        if (pw.length() < 10) {
            throw new IOException("비밀번호가 너무 짧습니다.");
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Exception03 w = new Exception03();
    }
}
