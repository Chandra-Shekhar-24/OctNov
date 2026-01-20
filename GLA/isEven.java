import java.util.Scanner;
public class isEven{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = obj.nextInt();
        }

        boolean result = isEvenFind(arr,size);
        System.out.println(result);
    }

    public static boolean isEvenFind(int[] arr,int size){
        for(int ele: arr){
            if(ele%2 != 0){
                return true;
            }
        }
        return false;
    }
}