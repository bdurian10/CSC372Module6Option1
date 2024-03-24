package csc372Module6Option1;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	
	static int indexSmallest;	//stores index of smallest element
	static Student temp;		//temporary variable for swap
	
	public static void sort(ArrayList<Student> students, Comparator<Student> c) {
		//Loop through students
		for(int i = 0; i < students.size() - 1; i++) {
			indexSmallest = i;
			for(int j = i + 1; j < students.size(); j++) {
				//Compare Student at indexSmallest to Student at j
				//If Student at j is smaller, set indexSmallest to j
				if(c.compare(students.get(indexSmallest), students.get(j)) > 0) {
					indexSmallest = j;
				}
			}
			//Swap smallest value of compared attribute with students.get(i)
			temp = students.get(i);
			students.set(i,  students.get(indexSmallest));
			students.set(indexSmallest, temp);
		}
	}
	
	public static void main(String[] args) {
		//Declare ArrayList and 10 Student objects
		ArrayList<Student> students = new ArrayList<Student>();
		Student a = new Student(10, "John", "Denver");
		Student b = new Student(9, "Marie", "Los Angeles");
		Student c = new Student(8, "Clover", "Quebec");
		Student d = new Student(7, "Ellie", "New York");
		Student e = new Student(6, "Marcus", "Colorado Springs");
		Student f = new Student(5, "Alf", "Nantucket");
		Student g = new Student(4, "Beth", "Miami");
		Student h = new Student(3, "Ford", "Enterprise");
		Student i = new Student(2, "Alice", "Pomona");
		Student j = new Student(1, "Mary", "Wellspring");		
		
		//add students to ArrayList
		students.add(a);
		students.add(b);
		students.add(c);
		students.add(d);
		students.add(e);
		students.add(f);
		students.add(g);
		students.add(h);
		students.add(i);
		students.add(j);
		
		//Print unsorted ArrayList
		System.out.println("UNSORTED:");
		for(Student student : students) {
			System.out.println(student.toString());
		}
		
		//Sort by rollno
		sort(students, new RollnoSort());
		
		//Print ArrayList sorted by rollno
		System.out.println("\nSorted by Roll Number:");
		for(Student student : students) {
			System.out.println(student.toString());
		}
		
		//Sort by name
		sort(students, new NameSort());
		
		//Print ArrayList Sorted by name
		System.out.println("\nSorted by Name:");
		for(Student student : students) {
			System.out.println(student.toString());
		}	
	}

}
