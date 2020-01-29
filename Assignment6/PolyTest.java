package assignment6;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class PolyTest {
	
	ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(4,0,2,1,4,4));
	ArrayList<Integer> arr1=new ArrayList<Integer>(Arrays.asList(3,0,-7,1,5,3,-8,5));
	Operation obj= new Operation(arr);
	Operation obj1= new Operation(arr1);
	@Test
	public void test() 
	{
		
		int result=obj.degree();
		int expected=4;
		assertEquals(expected,result);
	}
	
	@Test
	public void Test1()
	{
		ArrayList<String> result=obj.addition(obj,obj1);
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(7, 0, -5, 1, 5, 3, 4, 4, -8, 5));
		assertEquals(expected,result);
	}
	
	@Test
	public void Test2()
	{
		ArrayList<String> result=obj.multiply(obj,obj1);
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(12,0, -28,1, 20,3, -32,5, 6,1, -14,2, 10,4, -16,6, 12,4, -28,5, 20,7, -32,9, -24,5, 56,6, -40,8, 64,10));
		assertEquals(expected,result);
	}
	
	@Test
	public void Test3()
	{
		int result=obj.calculate(4);
		int expected = 1036;
		assertEquals(expected,result);
		
	}
}
