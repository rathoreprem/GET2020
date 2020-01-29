package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMirror 
{
	/**
	 * @param List, it is a Input ArrayList
	 * @return it return largest mirror length section
	 */
		public static int maxMirror(ArrayList<Integer> List) {
			  int len = List.size();
			  if(len == 0)
				{
					throw new AssertionError();
				}
			  else
			  {
			  int count = 0;
			  int mirrorLength = 0;
			  for (int i = 0; i < len; i++)
			  {
			    count = 0;
			    for (int j = len-1; i + count < len && j > -1; j--)
			    {
			      if(List.get(i+count) == List.get(j)){
			        count++;
			      }
			      else
			      {
			        if (count > 0)
			        {
			          mirrorLength = Math.max(count, mirrorLength);
			          count = 0;
			        }
			      }
			    }
			    mirrorLength = Math.max(count, mirrorLength);
			  }
			  
			  return mirrorLength;
			}
	
		}
	public static void main(String[] args) 
	{
		ArrayList<Integer> List=new ArrayList<Integer>(Arrays.asList(1, 4, 5, 3, 5, 4, 1));
		System.out.println(maxMirror(List));
	}

}
