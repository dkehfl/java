package CH_220814;

import java.util.Arrays;

// 다음과 같이 import를 사용할 수 있습니다.
class Solution {
    public int[] solution(int[] people) {
        int S = 0;
        int M = 0;
        int L = 0;
        int XL = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] < 95) {
                S = S + 1;
            }
            if (people[i] >= 95 && people[i] < 100) {
                M = M + 1;
            }
            if (people[i] >= 100 && people[i] < 105) {
                L = L + 1;
            }
            if (people[i] >= 105) {
                XL = XL + 1;
            }
        }
        // 여기에 코드를 작성해주세요.
        int[] answer = new int[4];
        answer[0] = S;
        answer[1] = M;
        answer[2] = L;
        answer[3] = XL;
        return answer;
    }



    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] people = {97, 102, 93, 100, 107};
        int[] ret = sol.solution(people);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}