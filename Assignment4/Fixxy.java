package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Fixxy
{	
	/**
	 * 
	 * @param arr=ArrayList
	 * @param x=4
	 * @param y=5
	 * @return it return a ArrayList which contain X,Y adjacents values
	 */
   public static ArrayList<Integer> fixxy(ArrayList<Integer> arr, int x, int y)
	{	
	   int find = 0,count1 = 0,count2 = 0;
	   for(int i = 0; i < arr.size(); i++)
	   {
		   if(arr.get(i) == x && i == (arr.size() - 1))
		   {
			   find = 1;
		   }
		   if((arr.get(i) == x && arr.get(i-1) == x) && i > 0)
		   {
			   find = 1;
		   }
		   if(arr.get(i) == x)
		   {
			   count1++;
		   }
		   if(arr.get(i) == y)
		   {
			   count2++;
		   }
	   }
	   if(count1 != count2)
	   {
		   find = 1;
	   }
		ArrayList<Integer> array = new ArrayList<Integer>();
		if(arr.size() == 0)
			{
				throw new AssertionError();
			}
		
		else if (find == 1)
		{
			throw new AssertionError();
	
		}
		else
			{
				for(int i = 0; i < arr.size(); i++)
				{
					if(arr.get(i) != x && arr.get(i) != y)
						{
						 	array.add(arr.get(i));
						}

				}
				int j = 0;
				for(int i = 0; i < arr.size(); i++)
				{
					if (arr.get(i) == x)
						{
							arr.set(i, x);
							arr.set(i+1, y);
							i++;   
						}
					else
						{		
							arr.set(i, array.get(j));
							j++;
						}
				}
				
		  }
		
		return arr;
}

	public static void main(String[] args)
		{
			ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,4,5,1,1,4,5));
			
			System.out.println("ArrayList : " + arr);
			
			System.out.println(fixxy(arr,4,5));
		}

}
