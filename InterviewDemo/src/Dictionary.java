
public interface Dictionary<K, V> {
	
	public void clear();
	
	public void insert(K key, V value);
	
	public V remove(K key);
	
	public V removeAny();
	
	public V find(K key);
	
	public int size();
	 
}
