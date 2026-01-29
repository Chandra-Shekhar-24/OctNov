import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        boolean result = isPalindrome(number);
        System.out.println(result);
    }
        public static boolean isPalindrome(int number){
            int x = number;
            int reverse = 0;
            while(number !=0){
                int lastdigit = number %10;
                reverse = reverse *10 +lastdigit;
                number = number/10;
            }
            if(reverse == x){
                return true;
            }
            else{
                return false;
            }
        }
    }