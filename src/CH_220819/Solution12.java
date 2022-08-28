package CH_220819;
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution12 {
    public int solution12(int[] scores) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int average = 0;
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                scores[i] = max;
            }
            else if (min > scores[i]) {
                scores[i] = min;
            }
            average = scores.length - 2;
            sum += scores[i];

        }

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        int[] scores1 = {35, 28, 98, 34, 20, 50, 85, 74, 71, 7};
        int ret1 = sol.solution12(scores1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] scores2 = {1, 1, 1, 1, 1};
        int ret2 = sol.solution12(scores2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}