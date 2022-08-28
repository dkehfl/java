package CH_220515;
import java.util.Scanner;
public class Project0515_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("성적을 입력하세요.");
        String grade = s.next();

        switch (grade) {
            case "a":
            case "A":
                System.out.println("훌륭합니다.");
                break;
            case "b":
            case "B":
                System.out.println("좋습니다.");
                break;
            case "c":
            case "C":
                System.out.println("보통입니다.");
                break;
            case "d":
            case "D":
                System.out.println("노력하세요.");
                break;
            default:
                System.out.println("잘못 입력했습니다.");
        }
    }
}
