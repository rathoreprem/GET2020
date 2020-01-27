package assignment6;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import assignment.Fixxy;

public class IntSetTest {
	ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
	ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(5,6));
	Set s1 = new Set(arr1);

	@Test
	public void test() 
	{
		Set st = new Set(arr);
		boolean result = st.isMember(8);
		boolean expected = false;
		assertEquals(result,expected);
	}
	
	@Test
	public void test1()
	{
		Set st=new Set(arr);
		int result = st.size();
		int expected = arr.size();
	 	assertEquals(result,expected);
	}

	
	@Test
	public void Test2()
	{
		Set st = new Set(arr);
		Set s1 = new Set(arr1);
		boolean result = st.isSubSet(s1);
		boolean expected = false;
		assertEquals(result,expected);
	}
	
	@Test
	public void Test3()
	{
		Set st = new Set(arr);
		ArrayList<Integer> result = st.getComplement();
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for(int i = 5; i < 1000; i++)
					expected.add(i);
				
		assertEquals(expected,result);
		
	}
	@Test
	public void Test4()
	{
		Set st = new Set(arr);
		ArrayList<Integer> result = st.union(st, s1);
		ArrayList expected = new ArrayList<Integer>(Arrays.asList(5,6,1,2,3,4));
		assertEquals(result,expected);
	}
}
