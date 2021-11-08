
public interface INode<E> {

	/**
	 * Get the element value
	 * @return E
	 */
	public E element();

	/**
	 * Set the element value
	 * @param v
	 */
	public void setElement(E element);

	/**
	 * Method used for getting left child of the node
	 * @return The left child
	 */
	public INode<E> left();

	/**
	 * Method used for getting right child of the node
	 * @return The right child
	 */
	public INode<E> right();

	/**
	 * Method used for checking whether the node is a leaf node
	 * @return True if a leaf node, false otherwise
	 */
	public boolean isLeaf();
}
