package datastructure_5;

public class Element 
{
Element leftElement;
Element rightElement;
private int key;
private int value;
public Element(int key,int value)
{
	this.key=key;
	this.value=value;
	leftElement=null;
	rightElement=null;
}
public int getKey()
{
	return key;
}
public int getValue()
{
	return value;
}
}