package recurction;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abcdcba"));
	}
	public static boolean isPalindrome(String str) {
	    return isPalindrome(str, 0, str.length()-1);
	    
	}
	public static boolean isPalindrome(String str, int start, int end) {
	    if(start == end)
	    return true;
	    
	    if(str.charAt(start) != str.charAt(end))
	    return false;
	    
	    return isPalindrome(str, start+1, end-1);
	}
}
