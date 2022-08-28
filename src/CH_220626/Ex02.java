package CH_220626;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;       // 랜덤 끌어와서 형변환!! answer에 저장!!!
        int input = 0;      // 내가 작성할 숫자
        int count = 0;      // 0으로 초기화

        do {
            count++;
            System.out.println("1과 100사이 값 입력: ");
            input = new Scanner(System.in).nextInt();

            if (answer > input) {
                System.out.println("더 큰 수 입력");
            } else if (answer < input) {
                System.out.println("더 작은 수 입력");
            } else {
                System.out.println("맞음");
                System.out.println("시도횟수: " + count + "번.");
                break;
            }
        } while(true);
    }
}

