import java.util.Scanner;
public class fibonacciseries {
    public static int fibonacci(int[]arr){
        int sum = 0;
        if(arr.length == 0){
            return 0;
        }

        
        int i=1;
        while(i<arr.length){
            sum = arr[i-1]+arr[i];
            arr[i]=arr[i];
            arr[i] = sum;
            i++;
        }
        for(int ele :arr){
            System.out.println(ele);
        }
        System.out.println();
        System.out.println("Sum");
        return sum;
    }
    public static void main(String[] args) {
        // Scanner obj = new Scanner(System.in);
        // int size = obj.nextInt();

        // int[] arr = new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i] = obj.nextInt();
        // }
        int[] arr = {0,1,1,2,3,5,8};
        System.out.println(fibonacci(arr));
    }
}
