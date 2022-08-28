package CH_220814;

public class Solution02 {
    public int solution02(String[][] cards) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;

        int[] count = new int[3];
        for(int i = 0; i <= 2; i++) {
            if (cards[i][0].equals("black")) {
                count[0]++;
            } else if (cards[i][0].equals("red")) {
                count[1]++;
            } else if (cards[i][0].equals("blue")) {
                count[2]++;
            }
            answer += Integer.parseInt(cards[i][1]);
        }

        if(count[0] == 3 || count[1] == 3 || count[2] == 3) {
            answer = answer * 3;
        }
        else if(count[0] == 2 || count[1] == 2 || count[2] == 2) {
            answer = answer * 2;
        }
        else {
            answer = answer;
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution02 sol = new Solution02();
        String[][] cards1 = {{new String("blue"), new String("2")}, {new String("red"), new String("5")}, {new String("black"), new String("3")}};
        int ret1 = sol.solution02(cards1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[][] cards2 = {{new String("blue"), new String("2")}, {new String("blue"), new String("5")}, {new String("black"), new String("3")}};
        int ret2 = sol.solution02(cards2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}