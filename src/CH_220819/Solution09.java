package CH_220819;
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution09 {
    public int[] solution09(int[] score) {
        // 여기에 코드를 작성해주세요.

        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            answer[i] = 1;

            for (int j = 0; j < score.length; j++) {
                if (score[i] < score[j]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution09 sol = new Solution09();
        int[] score1 = {90, 87, 87, 23, 35, 28, 12, 46};
        int[] ret1 = sol.solution09(score1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret1) + " 입니다.");

        int[] score2 = {10, 20, 20, 30};
        int[] ret2 = sol.solution09(score2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret2) + " 입니다.");
    }
}