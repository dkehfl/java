package CH_220619;

public class Solution02 {
    public int[] solution(int lottos[], int win_nums[]) {
        int[] answer = new int[2];
        int win = 0;
        int miss = 0;
        for(int i: lottos) {
            if(i == 0) {
                ++miss;     // 지워진 번호의 개수
            }
            else {
                for(int j: win_nums) {
                    win++;      // 맞힌 번호의 개수
                }
            }
        }
        switch(win) {
            case 1 :
                /*win + miss = 2;*/
                answer[0] = 5;
                break;


        }
        return answer;
    }

    public static void main(String[] args) {
        Solution02 CH = new Solution02();
    }
}