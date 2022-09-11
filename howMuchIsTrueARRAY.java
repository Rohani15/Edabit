package easy;

//Create a function which returns the number of true values there are in an array.

public class howMuchIsTrueARRAY
{

	public class Challenge 
	{
		  public static int countTrue(boolean[] arr) 
		  {
		    int count = 0;
		    for (boolean b : arr)
		    {
		      if (b == true) 
		      {
		        count++;
		      }
		    }
		    return count;
		  }
		}
}