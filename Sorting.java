package recurction;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={9,8,7,6,5,4,3,2,1};
		System.out.println(isSorted(a));
	}
	public static boolean isSorted(int[] arr) {
	    int n=arr.length;
	    return (isAscending(arr, n) || isDecending(arr, n));
	}
	public static boolean isAscending(int[] arr, int n) {
	    if(n==0 || n==1)
	    return true;
	  /*  if(arr[n-2]>arr[n-1])
	    return false;
	    else
	    return isAscending(arr, n-1);*/
	    return (arr[n-2]<=arr[n-1] && isAscending(arr, n-1)); //both way condt. works
	}
	public static boolean isDecending(int[] arr, int n) {
	    if(n==0 || n==1)
	    return true;
	   /* if(arr[n-2]<arr[n-1])
	    return false;
	    else
	    return isDecending(arr, n-1);*/
	    return (arr[n-2]>=arr[n-1] && isDecending(arr, n-1)); //both way condt. works
	}
}
