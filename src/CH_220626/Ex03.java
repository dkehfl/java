package CH_220626;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        try {
            System.out.println(list.get(0));
        } catch(CustomException e) {
            throw new CustomException("생성자!!");
        }
    }
}
