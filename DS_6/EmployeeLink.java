package datastructure_6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeLink {  

	@Test
	void test1()
	{	
		EmployeeLinkedList employeelink = new EmployeeLinkedList();
		Employee temp=employeelink.head;
		Employee last=employeelink.getLast(employeelink.head);
		Employee temp1=employeelink.QuickSortRecursion(temp, last);
		assertEquals("D", temp1.getName());
		assertEquals("A", temp1.next.getName());
		assertEquals("B", temp1.next.next.getName());
		assertEquals("E", temp1.next.next.next.getName());
		assertEquals("C", temp1.next.next.next.next.getName());
		
	}
	@Test
	void test2()
	{	
		EmployeeLinkedList employeelink = new EmployeeLinkedList();
		Employee temp=employeelink.head;
		Employee last=employeelink.getLast(employeelink.head);
		Employee temp1=employeelink.QuickSortRecursion(temp, last);
		
		assertEquals(15, temp1.getAge());
		assertEquals(17, temp1.next.getAge());
		assertEquals(23, temp1.next.next.getAge());
		assertEquals(25, temp1.next.next.next.getAge());
		assertEquals(67, temp1.next.next.next.next.getAge());
		
	}
	


}
