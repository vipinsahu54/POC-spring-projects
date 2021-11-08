

public class Node<K, E> implements INode<E>{

	private K key;
	private E element;
	private Node<K, E> left;
	private Node<K, E> right;
	
	/**
	 * Default Constructor
	 */
	public Node() {
		super();
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param key
	 * @param element
	 */
	public Node(K key, E element) {
		super();
		this.key = key;
		this.element = element;
		this.left=this.right=null;
	}

	/**
	 * Method used for getting key
	 * @return K
	 */
	public K key() {
		return key;
	}
	
	/**
	 * Set key
	 * @param key
	 */
	public void setKey(K key) {
		this.key=key;
	}
	
	@Override
	public E element() {
		return element;
	}
	
	@Override
	public void setElement(E element) {
		this.element = element;
	}
	
	@Override
	public Node<K, E> left() {
		return left;
	}
	
	public void setLeft(Node<K, E> node) {
		this.left=node;
	}
	
	@Override
	public Node<K, E> right() {
		return right;
	}
	
	public void setRight(Node<K, E> node) {
		this.right=node;
	}
	
	@Override
	public boolean isLeaf() {
		return (left == null && right ==null)?Boolean.TRUE : Boolean.FALSE;
	}
	
}
