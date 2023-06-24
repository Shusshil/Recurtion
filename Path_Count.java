package recurction;

public class Path_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CountPaths(0,0,3,3));
	}
	public static int CountPaths(int x, int y, int m, int n) {
	    if(x==m-1 || y==n-1)
	    return 1;
	    else 
	    return CountPaths(x+1, y, m, n)+CountPaths(x, y+1, m, n);
	}
}
