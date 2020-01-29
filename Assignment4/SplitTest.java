package assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SplitTest 
{
	Split obj = new Split();
	
	@Test (expected = AssertionError.class)
	public void empty() 
	{	
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList());
		int result = obj.splitArray(List);
	}
	
	@Test
	public void perfect()
	{
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(2, 1, 1, 1, 1));
		
		int result = obj.splitArray(List);
		
		int expected = 2;
		
		assertEquals(expected, result);
	}
}
