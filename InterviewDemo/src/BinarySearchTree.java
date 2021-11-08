/**
 * O(n log n) average-case time and O(n^2) worst-case time required to build the BST.
 *  
 * @author vipin sahu
 *
 * @param <K>
 * @param <E>
 */
public class BinarySearchTree<K extends Comparable<? super K>, E> implements Dictionary<K, E> {

	private Node<K, E> root;
	private int rootCount;
	
	/**
	 * Default Constructor
	 */
	public BinarySearchTree() {
		clear();
	}

	/**
	 * Method used for clearing binary search tree
	 */
	@Override
	public void clear() {
		root=null;
		rootCount=0;
	}

	/**
	 * Method used for inserting key and value in Binary Search Tree
	 * @param K	Key		: Key used for searching the correct node
	 * @param V Value	: Value of the Node
	 */
	@Override
	public void insert(K key, E value) {
		root = insertNode(root, key, value);
		rootCount++;
	}

	/**
	 * Method used for removing the node with the defined key from the tree.
	 * 
	 * @param 	K key		: Key which needs to be removed
	 * @return 	E element	: Removed record, null if there is none
	 */
	@Override
	public E remove(K key) {
		if(root == null) 
			return null;
		E element = findNode(root, key);
		if(element != null) {
			root = removeNode(root, key);
			rootCount--;
		}
		return element;
	}

	/**
	 * Remove the root node and replaced with best fitted node
	 * @return E element : Element of the removed node 
	 */
	@Override
	public E removeAny() {
		if(root == null) 
			return null;
		E element = root.element();
		root = removeNode(root, root.key());
		rootCount--;
		return element;
	}

	/**
	 * Find the element in the binary search tree on the basis of the given key.
	 * 
	 * @return E element : Element of the present node, null if node is not found.
	 */
	@Override
	public E find(K key) {
		return findNode(root, key);
	}

	/**
	 * Method used for finding the size of the tree.
	 * 
	 * @return int : Size of the tree.
	 */
	@Override
	public int size() {
		return rootCount;
	}
	
	/**
	 * Helper method used for removing and replacing the node with a best fitted node 
	 * so that the tree property is satisfied.
	 * 
	 * Which value can substitute for the one being removed?
	 * The answer is the least key value greater than (or equal to) the one being removed,
	 * or else the greatest key value less than the one being removed. 
	 * If either of these values replace the one being removed, then the BST property is maintained.
	 * ref. page : 167 - 169
	 * 
	 * @param	{@link Node} root : Contains the root node.
	 * @param	K key 			  : Key of the node which needs to be removed
	 * @return 	{@link Node} 	  : New replaced node
	 */
	private Node<K, E> removeNode(Node<K, E> root, K key){
		if(root == null)
			return null;
		if(root.key().compareTo(key) > 0)
			root.setLeft(removeNode(root.left(), key));
		else if(root.key().compareTo(key) < 0)
			root.setRight(removeNode(root.right(), key));
		else {
			Node<K, E> minNode=getMin(root.right());
			root.setElement(minNode.element());
			root.setKey(minNode.key());
			root.setRight(deleteMin(root.right()));
		}
		return root;
	}
	
	/**
	 * Method used for deleting the minimum node from the tree.
	 * @param root : Root node
	 * @return tree with minimum node removed
	 */
	private Node<K, E> deleteMin(Node<K, E> root){
		if(root.left() == null)
			return root.right();
		root.setLeft(deleteMin(root.left()));
		return root;
	}
	
	/**
	 * Method used for finding minimum Node from the tree
	 * @param root : Root node
	 * @return Minimum Node
	 */
	private Node<K, E> getMin(Node<K, E> root){
		if(root.left() == null)
			return root;
		return getMin(root.left());
	}
	
	/**
	 * Helper method used for finding the Node which has the given key.
	 * 
	 * @param	{@link Node} : Contains the root node.
	 * @param	K key		 : Key upon which the node need to be find
	 * @return 	E element	 : Returns the element of the node which has the given key.
	 */
	private E findNode(Node<K, E> root, K key){
		if(root == null)
			return null;
		if(root.key().compareTo(key) > 0)
			return findNode(root.left() , key);
		else if(root.key().compareTo(key) == 0)
			return root.element();
		else
			return findNode(root.right(), key);
	}
	
	/**
	 * Helper method used for inserting the new Node in the binary search tree.
	 * 
	 * @param	{@link Node} root : Root node of the tree
	 * @param	K key	 		  : Key used for finding the correct place for the new node
	 * @param	E element		  : Element which needs to be inserted
	 * @return 	{@link Node} node : The current subtree, modified to contain the new item
	 */
	private Node<K, E> insertNode(Node<K, E> root, K key, E element){
		if(root == null)
			return new Node<>(key, element);
		if(root.key().compareTo(key) > 0)
			root.setLeft(insertNode(root.left(), key, element));
		else
			root.setRight(insertNode(root.right(), key, element));
		return root;
	}

	
	public Integer getMaxLevelSum() {
		
		
		return null;
	}
}
