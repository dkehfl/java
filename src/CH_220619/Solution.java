package CH_220619;
import java.util.Scanner;
public class Solution {
    String s;

    public int solution(String s) {
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");
        int answer = Integer.parseInt(s);
        return answer;
    }

    /* public int output() {
        int answer = Integer.parseInt(s);
        return answer;
    } */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Solution num = new Solution();
        System.out.println(num.solution(a));
    }
}
