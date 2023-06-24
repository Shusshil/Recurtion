package recurction;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={9,8,7,6,5,4,3,2,1};
		int end=arr.length-1;
		System.out.println(binarySearchDec(0, end, arr, 1));
	}
	public static int binarySearchAsc(int start, int end, int[] arr, int target) {
	    if(start>end)
	    return -1;
	    int mid=start+(end-start)/2;
	    if(arr[mid]==target)
	    return mid;
	    if(arr[mid]>target)
	    return binarySearchAsc(start, mid-1, arr, target);
	    else 
	    return binarySearchAsc(mid+1, end, arr, target);
	}
	public static int binarySearchDec(int start, int end, int[] arr, int target) {
	    int mid=start+(end-start)/2;
	    
	    if(start>end)
	    return -1;
	   
	    if(arr[mid]==target)
	    return mid;
	    
	    if(arr[mid]<target)
	    return binarySearchDec(start, mid-1, arr, target);
	    else 
	    return binarySearchDec(mid+1, end, arr, target);
	}
}
