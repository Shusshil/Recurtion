package recurction;

public class Frequency_using_Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,3,4,4,4,5,5,5,5,6,7,8,9};
		System.out.println(FindFrequency(arr, 4));
	}
	public static int FindFrequency(int[] arr, int target) {
	    int startIndex=Frequency(arr, target, true);
	    if(startIndex==-1)
	    return -1;
	    int endIndex=Frequency(arr, target, false);
	    int count = (endIndex-startIndex)+1;
	    return count;
	}
	public static int Frequency(int[] arr, int target, boolean firstOccurance) {
	    int start=0;
	    int end=arr.length-1;
	    int result=-1;
	    while(start<=end) 
	    {
	        int mid=start+(end-start)/2;
	        
	        if(arr[mid]==target)
	        {
	        result=mid;
	        
	        if(firstOccurance)//start index of that no.
	        end=mid-1;
	        
	        if(firstOccurance == false)//end index of that no.
	        start=mid+1;
	        }
	        if(arr[mid]>target)
	        end=mid-1;
	        
	        else if(arr[mid]<target)
	        start=mid+1;
	    }
	    return result;
	}
}
