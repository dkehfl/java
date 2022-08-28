package CH_220515;
import java.util.Random;
import java.util.Scanner;
public class Project0515 {
    public static void main(String[] args) {
        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. :");
        Scanner s = new Scanner(System.in);
        int me = s.nextInt();
        Random rand = new Random();
        int rsp = rand.nextInt(4);

        switch (me) {
            case 1:
                me = rsp;
                System.out.println("당신은" + me + "입니다. 컴은" + rsp + "입니다. 비겼습니다");
                break;
            case 2:
                me = 1;
                rsp = 2;
                System.out.println("당신은" + me + "입니다. 컴은" + rsp + "입니다. 컴이 이겼습니다.");
                break;
            case 3:
                me = 1;
                rsp = 3;
                System.out.println("당신은" + me + "입니다. 컴은" + rsp + "입니다. 당신이 이겼습니다.");
                break;
            case 4:
                me = 2;
                rsp = 1;
                System.out.println("당신은" + me + "입니다. 컴은" + rsp + "입니다. 당신이 이겼습니다.");
                break;
            case 5:
                me = 2;
                rsp = 3;
                System.out.println("당신은" + me + "입니다. 컴은" + rsp + "입니다. 컴이 이겼습니다.");
                break;
            case 6:
                me = 3;
                rsp = 1;
                System.out.println("당신은" + me + "입니다. 컴은" + rsp + "입니다. 컴이 이겼습니다.");
                break;
            case 7:
                me = 3;
                rsp = 2;
                System.out.println("당신은" + me + "입니다. 컴은" + rsp + "입니다. 당신이 이겼습니다.");
                break;
            default:
                System.out.println("잘못 입력했습니다.");
        }


    }
}
