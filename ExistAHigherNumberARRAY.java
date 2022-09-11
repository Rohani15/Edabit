package easy;

//Write a function that returns true if there exists at least one number that is larger than or equal to n.
//Return false for an empty array [].

public class ExistAHigherNumberARRAY 
{
	public static boolean existsHigher(int[] A, int n) {
		if(A.length != 0)
		{
			for(int x : A)
			{ if(x >= n) return true;} 
		} return false; 
	}
}
