package assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class Poly {
	
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(4,0,2,1,4,4));
		ArrayList<Integer> arr1=new ArrayList<Integer>(Arrays.asList(3,0,-7,1,5,3,-8,5));
		Operation op= new Operation(arr);
		Operation op1= new Operation(arr1);
		System.out.println(op.calculate(4));
		System.out.println(op.degree());
		System.out.println(op.multiply(op,op1));
		System.out.println(op.addition(op,op1));
	}
}

class Operation {
	final ArrayList<Integer> even=new ArrayList<Integer>();
	final ArrayList<Integer> odd=new ArrayList<Integer>();
	public  Operation(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++)
		{
		  if (i % 2 == 0)
		  {
			 even.add(arr.get(i));
		  }
		  else
		  {
			 odd.add(arr.get(i));
		  }
		}
	}
	/**
	 * @return result(its return calculate value of polynomial function)
	 */
	public int calculate(int value){
		
		int s = odd.size();
		int result = 0;
		System.out.println(even);
		System.out.println(odd);
		
		for(int i = 0; i < s ; i++)
		{ 
			 result = result + (int)(even.get(i) * (Math.pow(value, odd.get(i))));
		}
		return result;
	}
	/**
	 * 
	 * @return max(it return the maximum degree of polynomial)
	 */
	public int degree()
	{
		int max = -1;
		for(int i = 0; i < odd.size(); i++)
		{
			if(odd.get(i) > max)
			{
				max = odd.get(i);
			}
		}
		return max;
	}
	/**
	 * 
	 * @param list1 AraayList
	 * @param list2 ArrayList
	 * @return array (contain multiplication vaule of list1 and list2)
	 */
	public ArrayList<String> multiply(Operation op,Operation op1) {
		
		ArrayList<String> array =new ArrayList<String>();
		for (int k = 0; k < op.even.size(); k++)
	    	for (int j = 0; j < op1.even.size(); j++)
	    	{
	    		int x = (op.even.get(k) * op1.even.get(j));
	    		int y = op.odd.get(k) + op1.odd.get(j);
	    		array.add(x+","+y);
	    	}
	    	return array;

	}
	/**
	 * @param list1 ArrayList
	 * @param list2 ArrayList
	 * @return add (addition of list1 and list2)
	 */
	
	public ArrayList<String> addition(Operation op,Operation op1) 
	{	ArrayList<String> List=new ArrayList<String>();
		int ls1 = op.even.size();
		int ls2 = op1.even.size();
		int l=ls1<ls2?ls1:ls2;
		
		for(int i = 0; i <l; i++)
		{	
			if(op.odd.get(i) == op1.odd.get(i))
			{
				List.add((op1.even.get(i) + op.even.get(i) + "," + op1.odd.get(i)));
			}
			else
			{
				List.add((op1.even.get(i) + "," + op1.odd.get(i)));
				List.add((op.even.get(i) + "," + op.odd.get(i)));
			}
		}
		for(int i = l;i<ls1 ; i++)
		{
			List.add((op.even.get(i) + "," + op.odd.get(i)));
		}
		for(int i = l;i<ls2 ; i++)
		{
			List.add((op1.even.get(i) + "," + op1.odd.get(i)));
		}
		return List;
	}
}

