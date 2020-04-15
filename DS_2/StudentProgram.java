package datastructure_2;

public class StudentProgram {
private String name;
private int capacity;
public int occupied=0;
public StudentProgram(String name,int capacity)
{
	this.name=name;
	this.capacity=capacity;
}
public String getName()
{
	return name;
}
public int getCapacity()
{
	return capacity;
}
}
