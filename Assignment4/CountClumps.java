package assignment;
import java.util.*;

public class CountClumps {
	/**
	 * 
	 * @param List (ArrayList)
	 * @return it return number of CountClumps
	 */
	 static int clamp(ArrayList<Integer> List)
	 {
		 int num=0;
		int count = 0;
		for(int i = 0; i < List.size() - 1; i++)
		{
			if(List.get(i) == List.get(i + 1) && i!=List.size()-1)
			{
					count++;
			}
			else if(count!=0)
			{
				num++;
				count=0;
			}
		}
		return num +1;
	}

	public static void main(String args[])
	{
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 4,4));
		
		System.out.println("ArrayList : " + List);
		
		System.out.println(clamp(List));
	}

}
