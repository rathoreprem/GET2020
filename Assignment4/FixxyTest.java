package assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class FixxyTest
{
	
	Fixxy obj = new Fixxy();
	
	@Test (expected = AssertionError.class)
	public void empty() 
	{	
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList());
		ArrayList<Integer> result = obj.fixxy(List,4,5);
	}
	
	@Test
	public void perfect()
	{
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 1, 1, 4, 5));
		
		ArrayList<Integer> result = obj.fixxy(List,4,5);
		
		ArrayList expected = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 1, 1, 4, 5));
		
		assertEquals(expected, result);
	}
	
	@Test (expected = AssertionError.class)
	public void test1() 
	{	
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(1, 4, 4, 1, 1, 4, 5));
		ArrayList<Integer> result = obj.fixxy(List,4,5);
	}
	
	
	@Test (expected = AssertionError.class)
	public void test2() 
	{	
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(1, 4, 4, 1, 1, 4, 5));
		ArrayList<Integer> result = obj.fixxy(List,4,5);
	}
}