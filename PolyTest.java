package assignment6;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class PolyTest {
	
	ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,3,6,7,9,8));
	ArrayList<Integer> arr1=new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,9));
	Operation op= new Operation(arr);
	@Test
	public void test() 
	{
		
		int result=op.degree();
		int expected=8;
		assertEquals(expected,result);
	}
	
	@Test
	public void Test1()
	{
		ArrayList<Integer> result=op.addition(arr,arr1);
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 6, 10, 12, 15,17));
		assertEquals(expected,result);
	}
	
	@Test
	public void Test2()
	{
		ArrayList<Integer> result=op.multiply(arr,arr1);
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 9, 25, 49, 84, 128, 158, 173, 157, 129, 72, 0));
		assertEquals(expected,result);
	}
	
	@Test
	public void Test3()
	{
		int result=op.calculate(2);
		int expected = 3080;
		assertEquals(expected,result);
		
	}
}
