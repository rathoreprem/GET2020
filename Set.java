package assignment6;
import java.util.*;
public class Set {
	final ArrayList<Integer> arr;
	public Set(ArrayList x)
	{
		arr=x;
	}
	
	/**
	 * 
	 * @param x contain a vaule which check in set
	 * @return arr.contain return a boolean function, true if x persent in set, false if x is not present in set
	 */
	public boolean isMember(int x)
	{
		return arr.contains(x);
	}
	
	
	
	/**
	 * 
	 * @return size of set arr
	 */
	public int size()
	{
		return arr.size();
	}
	
	/**
	 * 
	 * @return add return getcomplement
	 */
	public ArrayList<Integer> getComplement()
	{
		ArrayList<Integer> add=new ArrayList<Integer>();
		
		int found=0;
		for(int j=1;j<1000;j++)
			{ found=0;
				for(int i=0;i<arr.size();i++)
				{
					if(j==arr.get(i))
					{
						found=1;
						break;
					}
				}
				if(found==0)
				{
					
					add.add(j);
				}
				
			} 
			return add; 
	}
	
	/**
	 * 
	 * @param s1 is a subset 
	 * @return it return boolean function (if s1 is subset of super class then return true otherwise false)
	 */
	public boolean isSubSet(Set s1)
	{
		boolean returnanswer=false;
		for(int i=0;i<s1.arr.size();i++)
		{
			 returnanswer=false;
			for(int j=0;j<this.arr.size();j++)
			{
				if (s1.arr.get(i)==this.arr.get(j))
				{
					returnanswer=true;
					break;
				}
			}
			if(returnanswer==false)
			{
				break;
			}
		}
		return returnanswer;
	}
	/**
	 * 
	 * @param s1 set
	 * @param s set
	 * @return union of s1 and s
	 */
	public ArrayList<Integer> union(Set s1, Set s)
	{
		ArrayList<Integer> newSet = new ArrayList<Integer>(s.arr);
		newSet.addAll(s1.arr);
		ArrayList<Integer> newlist=new ArrayList<Integer>(newSet);	
		ArrayList<Integer> new1=new ArrayList<Integer>();
		for(int i=0;i<newlist.size();i++)
		{
			for(int j=i+1;j<newlist.size();j++)
			{
				if(newlist.get(i)==newlist.get(j))
				{
					newlist.remove(j);
				}
			}
			new1.add(newlist.get(i));
		}	
		return new1;		
	}

	
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,3,6,7,9));
		ArrayList<Integer> arr1=new ArrayList<Integer>(Arrays.asList(1,5,8));
		Set s1= new Set(arr1);

		Set s= new Set(arr);
		System.out.println(s.size());
		System.out.println(s.isMember(9));
		System.out.println(s.isSubSet(s1));
		ArrayList<Integer> arr2 = s.getComplement();
		 System.out.println(arr2);
		ArrayList<Integer> arr3 = s.union(s1, s);
		  System.out.println(arr3);
		
	}
}
