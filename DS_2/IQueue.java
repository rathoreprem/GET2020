package datastructure_2;

public interface IQueue {
	int Max_Size=5;
	Boolean isFull();
	Boolean isEmpty();
	void delete();
	void add(int item);
}