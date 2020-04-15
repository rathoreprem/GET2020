package datastructure_3;

public class Item {
	int data;
	int priority;
	Item(int data,int priority)
	{
		this.data=data;
		this.priority=priority;
	}
	public int getData()
	{
		return data;
	}
	public int getPriority()
	{
		return priority;
	}
}