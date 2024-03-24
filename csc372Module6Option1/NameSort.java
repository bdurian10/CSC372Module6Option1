package csc372Module6Option1;

import java.util.Comparator;

public class NameSort implements Comparator<Student>{
	
	public int compare(Student a, Student b) {
		return a.getName().compareToIgnoreCase(b.getName());
	}

}
