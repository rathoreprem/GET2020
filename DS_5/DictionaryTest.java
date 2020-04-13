package datastructure_5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class DictionaryTest {
TreeMap<Integer,Integer> sortedlist;
	@Test
	void test() {
		Dictionary dictionary=new Dictionary();
		HashMap<Integer,Integer> listOfElements=new HashMap<Integer,Integer>();
		listOfElements.put(20,122);
		listOfElements.put(25,122);
		listOfElements.put(39,2);
		listOfElements.put(11,32);
		listOfElements.put(18,9);
		listOfElements.put(1,221);
		listOfElements.put(22,22);
		dictionary.add(listOfElements);
		Element temp=dictionary.head;
		
		int output=dictionary.getValueOfKey(18,dictionary.head);
		assertEquals(output,9);
	}
}
