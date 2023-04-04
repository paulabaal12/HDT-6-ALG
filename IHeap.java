//obtenido de ejemplo mostrado en clase
public interface IHeap<P, V> {

	void Insert(P priority, V value);
	
	V get();
	
	V remove();
	
	int count();
	
	boolean isEmpty();
	
}
