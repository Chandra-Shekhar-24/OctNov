package JavaProgramming.questions;
import java.util.Scanner;
public class createPinUsingThreeNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();

        int num2 = obj.nextInt();

        int num3 = obj.nextInt();

        int on1 = num1 % 10;
        int on2 = num2 % 10;
        int on3 = num3 % 10;

        int up = Math.min(Math.min(on1, on2), on3);

        int tn1 = (num1 / 10) % 10;
        int tn2 = (num2 / 10) % 10;
        int tn3 = (num3 / 10) % 10;
        int tp = Math.min(Math.min(tn1, tn2), tn3);

        int hn1 = num1 / 100;
        int hn2 = num2 / 100;
        int hn3 = num3 / 100;
        int hp = Math.min(Math.min(hn1, hn2), hn3);

        // int tpo = Math.max(Math.max(on1, on2), on3);
        // int tpu = Math.max(Math.max(tn1, tn2), tn3);
        // int tph = Math.max(Math.max(hn1, hn2), hn3);

        // int tpp = Math.max(Math.max(tpo, tpu), tph);

        int[] arr = {num1,num2,num3};
        int thousand = 0;
        for (int ele:arr) {
            while(ele>0){
                int temp = ele;
                thousand = Math.max(thousand, ele%10);
                ele = ele/10;
            }
        }

        System.out.println(1000*thousand+100*hp+10*tp+up);
    }
}