import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(32, "vipin"));
		students.add(new Student(12, "ssj"));
		students.add(new Student(92, "ksj"));
		students.add(new Student(2, "owi"));
		

		System.out.println(students);
		
		//Sorting only works with comparable and comparator interface for custom classes
		Collections.sort(students);
		System.out.println(students);
	}

}
