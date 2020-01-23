package assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class Poly {
	
	/*public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,3,6,7,9,8));
		ArrayList<Integer> arr1=new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,9));
		Operation op= new Operation(arr);
		
		/*System.out.println(op.calculate());
		System.out.println(op.degree());
		System.out.println(op.multiply(arr,arr1));
		System.out.println(op.addition(arr,arr1));
	}*/
}

class Operation {
	
	 final ArrayList<Integer> even=new ArrayList<Integer>();
	 final ArrayList<Integer> odd=new ArrayList<Integer>();
	public  Operation(ArrayList<Integer> arr){
		int s=arr.size();   
		
		for(int i=0;i<arr.size();i++)
		{
		  if (i%2==0)
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
	public int calculate(int x){
		
		int s=odd.size();
		int result=0;
		System.out.println(even);
		System.out.println(odd);
		for(int i=0;i<s;i++)
		{ 
			 result = result +(int)(even.get(i)*(Math.pow(x, odd.get(i))));
		}
		return result;
	}
	/**
	 * 
	 * @return max(it return the maximum degree of polynomial)
	 */
	public int degree()
	{
		int max=-1;
		for(int i=0;i<odd.size();i++)
		{
			if(odd.get(i)>max)
			{
				max=odd.get(i);
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
	public ArrayList<Integer> multiply(ArrayList<Integer> list1,ArrayList<Integer> list2) {
		
	    ArrayList<Integer> array =new ArrayList<Integer>(list1.size()+list2.size());

	    for (int i=0;i<list1.size()+list2.size();i++)
	        array.add(0);

	    for (int i=0;i<list1.size();i++)
	    	for (int j=0;j<list2.size();j++)
	    		array.set(i+j,((list1.get(i)*list2.get(j))+array.get(i+j)));
	    	return array;

	}
	/**
	 * @param list1 ArrayList
	 * @param list2 ArrayList
	 * @return add (addition of list1 and list2)
	 */
	public ArrayList<Integer> addition(ArrayList<Integer> list1, ArrayList<Integer> list2) 
	{
		int ls1=list1.size();
		int ls2=list2.size();
		int l=(ls1>ls2)?ls1:ls2;
		 ArrayList<Integer> add=new ArrayList<Integer>(l);
		
		for (int i=0;i<ls1;i++) { 
            add.add(list1.get(i)); 
        } 
  
        for (int i=0;i<ls2;i++) { 
            add.set(i,list1.get(i)+list2.get(i)); 
        } 
        return add; 
		
	}
}
