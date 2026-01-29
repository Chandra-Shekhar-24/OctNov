import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {	
		int [] arr = {10,15,87,96,58,63,83};
 		int target = 15; 
		
		int low = 0;
		int high = arr.length-1;
		
		
		while(low<=high){
			int mid = low+(high-low)/2;
			if(arr[mid] == target){
				System.out.println("found");
			}
			if(arr[mid]<target){
				low = mid+1;
			}
			else{
				high = mid-1;
			}			
		}
     }
}
