package datastructure_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeLink {

	@Test
	void test1()
	{	
		EmployeeLinkedList employeelink = new EmployeeLinkedList();
		Employee temp=employeelink.head;
		employeelink.sortEmployeesLinkedList();
		
		assertEquals("D", employeelink.head.getName());
		assertEquals("A", temp.next.getName());
		assertEquals("B", temp.next.next.getName());
		assertEquals("E", temp.next.next.next.getName());
		assertEquals("C", temp.next.next.next.next.getName());
		
	}
	@Test
	void test2()
	{	
		EmployeeLinkedList employeelink = new EmployeeLinkedList();
		Employee temp=employeelink.head;
		employeelink.sortEmployeesLinkedList();
		
		assertEquals(15, employeelink.head.getAge());
		assertEquals(17, temp.next.getAge());
		assertEquals(23, temp.next.next.getAge());
		assertEquals(25, temp.next.next.next.getAge());
		assertEquals(67, temp.next.next.next.next.getAge());
		
	}
	


}
