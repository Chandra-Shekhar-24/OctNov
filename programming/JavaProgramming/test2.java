// import java.util.Scanner; // explicit
// //import java.util.*; // implicit
// public class test2 {
//     public static void main(String[] args) {
//         Scanner obj  = new Scanner(System.in);
//         System.out.print("Enter array size: ");
//         int size = obj.nextInt();

//         int[] arr = new int[size];
//         for(int i=0;i<arr.length;i++){
//             arr[i] = obj.nextInt();
//         }

//         System.out.println("Enter target element: ");
//         int target = obj.nextInt();

//         boolean flag = false;

//         int low = 0;
//         int high = size-1;

//         while(low<=high){
//             int mid = (low+high)/2;

//             if(arr[mid] == target){
//                 System.out.println("found");
//                 flag = true;
//                 break;
//             }

//             if(arr[mid]<target){
//                 low = mid+1;
//             }

//             else{
//                 high = mid-1;
//             }
//         }

//         if(flag == false){
//             System.out.println("not found");
//         }
//     }
// }




import java.util.Scanner; 
public class test2 {
 public static int searchposition(int[] arr,int low,int high, int target){
    low = 0;
    high = arr.length-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid] == target){
            return mid;
        } 
        if(arr[mid]<target){
            low = mid+1;
        }
        else {
            high = mid-1;
        }
    }
    return low;
}
    public static void main(String[] args) {
       int[] arr = {1,3,5,6};
       System.out.println( searchposition(arr, 0, arr.length-1, 2));
       
    }
}