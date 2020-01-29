package assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class MaxMirrorTest
{
	MaxMirror obj = new MaxMirror();
	@Test (expected = AssertionError.class)
	public void empty() 
	{	
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList());
		int result = obj.maxMirror(List);
	}
	
	@Test
	public void perfect()
	{
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 4));
		
		int result = obj.maxMirror(List);
		
		int expected = 3;
		
		assertEquals(expected,result);
	}

}
