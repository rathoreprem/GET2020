package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Split {
	/**
	 * 
	 * @param List(ArrayList)
	 * @return it return split index
	 */
	static int splitArray(ArrayList<Integer> List)
	{	
		if(List.size() == 0)
		{
			throw new AssertionError();
		}
		else
		{
			int i, index = 0, add = 0, sum = 0;
			for(i = 0; i < List.size(); i++)
			{
				sum = sum + List.get(i);
			}
			for(i = 0; i < List.size(); i++)
			{	
				add = add + List.get(i);
				if(sum / 2 == add)
				{
					index = i + 1;
					break;
				}
			}
			return index;
		}
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(2, 1, 1, 1, 1));
		System.out.println(splitArray(List));

	}

}
