public class divisibleby2and3 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,9,14,48};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2 ==0 && arr[i]%3 ==0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
