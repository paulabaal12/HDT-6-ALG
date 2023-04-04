//obtenido de ejemplo mostrado en clase

public class TN<P, V> {

	private P _priority;
	private V _value;
	TN<P, V> _parent;
	TN<P, V> _left;
	TN<P, V> _right;
	
	public TN(P priority, V value) {
		set_priority(priority);
		set_value(value);
		set_parent(null);
		set_left(null);
		set_right(null);
	}
	
	public P get_priority() {
		return _priority;
	}
	public void set_priority(P _priority) {
		this._priority = _priority;
	}
	public V get_value() {
		return _value;
	}
	public void set_value(V _value) {
		this._value = _value;
	}
	public TN<P, V> get_parent() {
		return _parent;
	}
	public void set_parent(TN<P, V> _parent) {
		this._parent = _parent;
	}
	public TN<P, V> get_left() {
		return _left;
	}
	public void set_left(TN<P, V> _left) {
		this._left = _left;
	}
	public TN<P, V> get_right() {
		return _right;
	}
	public void set_right(TN<P, V> _right) {
		this._right = _right;
	}

	
	
}
