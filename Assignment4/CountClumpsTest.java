package assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class CountClumpsTest
{
	@Test
	public void perfect()
	{
		CountClumps obj = new CountClumps();
		
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(1,1,3,1,1));
		
		int result = obj.clamp(List);
		
		int expected = 1;
		
		assertEquals(expected, result);
	
	}
}