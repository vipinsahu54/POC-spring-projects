
public class MaxLevelSum {

	public static void main(String[] args) {
		BinarySearchTree<String, Integer> tree=new BinarySearchTree<>();
		tree.insert("a", 4);
		tree.insert("b", 2);
		tree.insert("c", -5);
		tree.insert("d", -1);
		tree.insert("e", 3);
		tree.insert("f", -2);
		tree.insert("g", 6);
		
		System.out.println(tree.size());
		

	}

}
