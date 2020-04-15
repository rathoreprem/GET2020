package datastructure_2;

public interface StudentQueueInter {
	int Max_Size=10;
	Boolean isFull();
	Boolean isEmpty();
	Student dequeue();
	void add(Student item);
}
